package com.xworkz.mayura.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

@WebServlet(loadOnStartup = 1, urlPatterns = "/booking")
public class BookingServlet extends HttpServlet
{
    public BookingServlet()
    {
        System.out.println("BookingServlet constructor is called");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running doPost() in BookingServlet");
        String gname = req.getParameter("gname");
        String checkInDate = req.getParameter("cidate");
        String checkOutDate = req.getParameter("codate");
        String roomType = req.getParameter("room");
        String guestNo = req.getParameter("guestno");
        String amount = req.getParameter("amount");
        System.out.println("Guest name:" + gname);
        System.out.println("Check in date:" + checkInDate);
        System.out.println("Check out date:" + checkOutDate);
        System.out.println("Room type:" + roomType);
        System.out.println("Guest no:" + guestNo);
        System.out.println("Amount:" + amount);


            LocalDate convertedInDate=LocalDate.parse(checkInDate);
            LocalDate convertedOutDate=LocalDate.parse(checkOutDate);
            int convertedGuestCount=Integer.parseInt(guestNo);
            double convertedAmount=Double.parseDouble(amount);



        PrintWriter out=resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        if(convertedInDate.isBefore(convertedOutDate) && convertedAmount>0)
        {
            System.out.println("valid data");
            out.println("<h1>Booking successful</h1>");
        }
        else
        {
            System.out.println("invalid data");
            out.println("<h1>Booking failed</h1>");
        }
        out.println("</body>");
        out.println("</html>");
    }
}

