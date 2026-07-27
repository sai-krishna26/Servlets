package com.xworkz.servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(loadOnStartup = 1, urlPatterns = "/msg")
public class MessageServlet extends GenericServlet {

    public MessageServlet() {
        System.out.println("MessageServlet Object is created");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("MessageServlet is called");

        String parameterValue1 = servletRequest.getParameter("message");
        System.out.println("Message from UI: " + parameterValue1);

        PrintWriter out=servletResponse.getWriter();
        out.println("Connection is successful or the console got the data from UI");

    }
}
