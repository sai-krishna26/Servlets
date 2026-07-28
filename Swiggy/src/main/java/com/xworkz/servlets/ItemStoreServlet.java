package com.xworkz.servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;


@WebServlet(loadOnStartup = 1, urlPatterns = "/item")
public class ItemStoreServlet extends GenericServlet {

    public ItemStoreServlet() {
        System.out.println("ItemStoreServlet Object is created");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("ItemStoreServlet service() is called");

        String productValue1 = servletRequest.getParameter("item");
        System.out.println("product from UI: " + productValue1);

        PrintWriter out=servletResponse.getWriter();
        out.println("Connected securely!! ,"+productValue1+" is stored in bag");

    }
}
