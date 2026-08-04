package com.xworkz.mayura.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet(loadOnStartup=1, urlPatterns="/regester")
public class VehicleRegServlet extends HttpServlet {

    public VehicleRegServlet(){
        System.out.println("VehicleRegServlet constructor is called");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running doPost() in VehicleRegServlet");
        String vehicleno=req.getParameter("vehicleno");
        String ownername=req.getParameter("ownername");
        String vehicletype=req.getParameter("vehicletype");
        String regdate=req.getParameter("regdate");
        String insurance=req.getParameter("insurance");
        String fueltype=req.getParameter("fueltype");

        System.out.println("Vehicle number:"+vehicleno);
        System.out.println("Owner name:"+ownername);
        System.out.println("Vehicle type:"+vehicletype);
        System.out.println("Registration date:"+regdate);
        System.out.println("Insurance valid till:"+insurance);
        System.out.println("Fuel type:"+fueltype);

        String numberPattern="^[A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{4}$";
        Pattern pattern = Pattern.compile(numberPattern);
        Matcher matcher=pattern.matcher(vehicleno);

        if(vehicleno==null || vehicleno.trim().isEmpty())
        {
            resp.setContentType("text/html");
            PrintWriter out=resp.getWriter();
            out.println("<html><body><h3>Error: Vehicle number is missing</h3></body></html>");
            return;
        }
        else
        {
            if(!matcher.matches())
            {
                resp.setContentType("text/html");
                PrintWriter out=resp.getWriter();
                out.println("<html><body><h3>Error: Vehicle number is invalid</h3></body></html>");
                return;
            }
        }
        if(ownername==null || ownername.trim().isEmpty())
        {
            resp.setContentType("text/html");
            PrintWriter out=resp.getWriter();
            out.println("<html><body><h3>Error: Owner name is missing</h3></body></html>");
            return;
        }

        LocalDate convertedRegDate=LocalDate.parse(regdate);
        LocalDate convertedInsDate=LocalDate.parse(insurance);
        if(convertedRegDate.isAfter(convertedInsDate))
        {
            resp.setContentType("text/html");
            PrintWriter out=resp.getWriter();
            out.println("<html><body><h3>Error: Insurance valid till date is before registration date</h3></body></html>");
            return;
        }
        PrintWriter out=resp.getWriter();
        out.println("<html><body><h3>Vehicle registered successfully</h3></body></html>");
    }
}
