package com.xworkz.mayura.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

@WebServlet(loadOnStartup = 1, urlPatterns = "/eregister")
public class EventRegistrationServlet extends HttpServlet {

    public EventRegistrationServlet() {
        System.out.println("EventRegistrationServlet constructor is called");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running doPost() in EventRegistrationServlet");
        String eventtype = req.getParameter("eventtype");
        String orgname = req.getParameter("orgname");
        String edate = req.getParameter("edate");
        String venue = req.getParameter("venue");
        String capacity = req.getParameter("capacity");
        String fee = req.getParameter("fee");

        System.out.println("Event type:" + eventtype);
        System.out.println("Organizer name:" + orgname);
        System.out.println("Event date:" + edate);
        System.out.println("Venue:" + venue);
        System.out.println("Capacity:" + capacity);
        System.out.println("Fee:" + fee);

        LocalDate convertedDate = LocalDate.parse(edate);
        int convertedCapacity = Integer.parseInt(capacity);
        long convertedFee=Long.parseLong(fee);

        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        if (!convertedDate.isAfter(LocalDate.now())) {
            resp.getWriter().println("<h2>Event date must be after today's date.</h2>");
            return;
        }

        if(convertedCapacity<0)
        {
            resp.getWriter().println("<h2>Capacity must be a positive number.</h2>");
            return;
        }

        if(convertedFee<0)
        {
            resp.getWriter().println("<h2>Fee must be a positive number.</h2>");
            return;
        }

//        double fee=0;
//        switch(eventtype)
//        {
//            case "Wedding":
//                fee=250000;
//                break;
//
//            case "Birthday":
//                fee=200000;
//                break;
//
//            case "Reception":
//                fee=300000;
//                break;
//
//            case "Social Gatherings":
//                fee=200000;
//                break;
//
//            case "Corporate Events":
//                fee=280000;
//                break;
//
//            case "Sports Events":
//                fee=250000;
//                break;
//
//            case "Other":
//                fee=150000;
//                break;
//
//            default:
//                fee=150000;
//                break;
//        }
//
//        req.setAttribute("eventtype",eventtype);
//        req.setAttribute("orgname",orgname);
//        req.setAttribute("edate",edate);
//        req.setAttribute("venue",venue);
//        req.setAttribute("capacity",capacity);
//        req.setAttribute("fee",fee);
//
//        //req.getRequestDispatcher("payment.jsp").forward(req,resp);


        out.println("<h2>Event registered successfully.</h2>");
        out.println("<a href='eventRegistration.html'>Register another event</a>");
        out.println("<br>");
        out.println("<br>");
        out.println("<a href='index.html'>Go to Home</a>");
        out.println("</body>");
        out.println("</html>");

    }


}
