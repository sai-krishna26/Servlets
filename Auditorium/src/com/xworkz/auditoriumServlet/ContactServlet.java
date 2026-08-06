package com.xworkz.auditoriumServlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(loadOnStartup = 1, urlPatterns = "/contact")
public class ContactServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("running doPost in ContactServlet");

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String subject = req.getParameter("subject");
        String messageText = req.getParameter("message");

        System.out.println("name :" + name);
        System.out.println("email :" + email);
        System.out.println("phone :" + phone);
        System.out.println("subject :" + subject);
        System.out.println("message :" + messageText);

        String message = name + ", Contact was sent Successfully";

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/contact.jsp");

        req.setAttribute("message", message);

        requestDispatcher.forward(req, resp);
    }
}
