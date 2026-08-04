package com.xworkz.mayura.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@WebServlet(loadOnStartup =1,urlPatterns="/lifecycle",initParams = {
        @WebInitParam(name="url",value="jdbc:mysql://localhost:3306/mayura"),
        @WebInitParam(name="user",value="ram"),
        @WebInitParam(name="password",value="bhoomi")
}
)
public class LifeCycleServlet implements Servlet {
    private Connection connection;
    private ServletConfig servletConfig;

    public LifeCycleServlet()
    {
        System.out.println("LifeCycleServlet constructor is called");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("LifeCycleServlet init(ServletConfig config) is called");
        this.servletConfig = config;

        try{
            System.out.println(config.getInitParameter("url"));
            System.out.println(config.getInitParameter("user"));
            System.out.println(config.getInitParameter("password"));
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=DriverManager.getConnection(config.getInitParameter("url"),config.getInitParameter("user"),config.getInitParameter("password"));
            System.out.println("Database connection established successfully");
        }catch(ClassNotFoundException e){
            System.out.println("MySQL JDBC Driver not found");
            e.printStackTrace();
        }catch(SQLException e){
            System.out.println("SQL Exception in init() of LifeCycleServlet");
            e.printStackTrace();
        }
    }

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("LifeCycleServlet service(ServletRequest servletRequest, ServletResponse servletResponse) is called");
    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {
        System.out.println("LifeCycleServlet destroy() is called");
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Database connection closed successfully");
            }
        } catch (Exception e) {
            System.out.println("Exception while closing connection");
            e.printStackTrace();
        }
    }
}
