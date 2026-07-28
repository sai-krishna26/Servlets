package com.xworkz.servlets;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.GenericServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(loadOnStartup = 2, urlPatterns = {"/l-info", "/location"})
public class LocationInfoServlet extends GenericServlet {

    public LocationInfoServlet() {
        System.out.println("LocationInfoServlet Object is created");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("LocationInfoServlet service() is called");
        String city=servletRequest.getParameter("city");
        String area=servletRequest.getParameter("area");
        String houseNo=servletRequest.getParameter("houseNo");

        System.out.println("Location Details from UI: ");
        System.out.println("City: "+city);
        System.out.println("Area: "+area);
        System.out.println("House No: "+houseNo);

        PrintWriter out=servletResponse.getWriter();
        out.println(city+"\n"+area+"\n"+houseNo+"\n \n location details stored!, Rider is on the way ->>🏍️");
    }

}
