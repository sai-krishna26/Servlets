package com.xworkz.mayura.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

@WebServlet(loadOnStartup =1,urlPatterns="/lifecycle",initParams = {
        @WebInitParam(name="url",value="jdbc:mysql://localhost:3306/mayura"),
        @WebInitParam(name="user",value="ram"),
        @WebInitParam(name="password",value="bhoomi")
}
)
public class LifeCycleServlet implements Servlet {
    private Connection connection;
    public LifeCycleServlet()
    {
        System.out.println("LifeCycleServlet constructor is called");
    }
    public void init(ServletConfig config){
        System.out.println("LifeCycleServlet init(ServletConfig config) is called");

        try{
            System.out.println(config.getInitParameter("url"));
            System.out.println(config.getInitParameter("user"));
            System.out.println(config.getInitParameter("password"));
            connection=DriverManager.getConnection(config.getInitParameter("url"),config.getInitParameter("user"),config.getInitParameter("password"));
        }catch(Exception e){
            System.out.println("Exception in init() of LifeCycleServlet");
        }
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("LifeCycleServlet service(ServletRequest servletRequest, ServletResponse servletResponse) is called");
    }

    @Override
    public String getServletInfo() {
        return "";
    }

    public void destroy() {
        System.out.println("LifeCycleServlet destroy() is called");

    }
}
