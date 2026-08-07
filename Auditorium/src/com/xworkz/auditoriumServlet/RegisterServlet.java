package com.xworkz.auditoriumServlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(loadOnStartup = 1, urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("running doPost in RegisterServlet");

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String gender = req.getParameter("gender");
        String mobile = req.getParameter("mobile");

        System.out.println("name :" + name);
        System.out.println("email :" + email);
        System.out.println("password :" + password);
        System.out.println("gender :" + gender);
        System.out.println("mobile :" + mobile);

        String message = name + ", Registered Successfully";

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/register.jsp");

        req.setAttribute("message", message);

        requestDispatcher.forward(req, resp);
    }
}