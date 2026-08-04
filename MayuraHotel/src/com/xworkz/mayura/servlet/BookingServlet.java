package com.xworkz.mayura.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
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
        //String checkOutDate = req.getParameter("codate");
        String roomType = req.getParameter("room");
        String guestNo = req.getParameter("guestno");
        //String amount = req.getParameter("amount");

        System.out.println("Guest name:" + gname);
        System.out.println("Check in date:" + checkInDate);
        System.out.println("Check out date:" + req.getParameter("codate"));
        System.out.println("Room type:" + roomType);
        System.out.println("Guest no:" + guestNo);
        //System.out.println("Amount:" + amount);


        LocalDate convertedInDate=LocalDate.parse(checkInDate);
        LocalDate convertedOutDate=LocalDate.parse(req.getParameter("codate"));


        if (!convertedInDate.isBefore(convertedOutDate)) {
            resp.getWriter().println("<h2>Check-out date must be after check-in date.</h2>");
            return;
        }
        double amount=0;

        switch(roomType)
        {
            case "Extra Deluxe":
                amount=3000;
                break;

            case "Deluxe":
                amount=1500;
                break;

            case "Couple Friendly":
                amount=2500;
                break;

            case "Brotherhood":
                amount=3200;
                break;

            case "Family":
                amount=4000;
                break;

            default:
                amount=1500;
                break;
        }

        req.setAttribute("guestName", gname);
        req.setAttribute("roomType", roomType);
        req.setAttribute("guestNo", guestNo);
        req.setAttribute("checkIn", checkInDate);
        req.setAttribute("checkOut", req.getParameter("codate"));
        req.setAttribute("amount", amount);

        req.getRequestDispatcher("payment.jsp")
                .forward(req,resp);
    }
}

