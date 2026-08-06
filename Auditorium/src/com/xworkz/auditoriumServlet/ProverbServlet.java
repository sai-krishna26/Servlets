package com.xworkz.auditoriumServlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(loadOnStartup = 1, urlPatterns = "/proverb")
public class ProverbServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("running doPost in ProverbServlet");

        String name = req.getParameter("name");
        String proverb = req.getParameter("proverb");
        String category = req.getParameter("category");
        String language = req.getParameter("language");
        String author = req.getParameter("author");

        System.out.println("name :" + name);
        System.out.println("proverb :" + proverb);
        System.out.println("category :" + category);
        System.out.println("language :" + language);
        System.out.println("author :" + author);

        String message = name + ", Proverb submitted Successfully";

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/proverb.jsp");

        req.setAttribute("message", message);

        requestDispatcher.forward(req, resp);
    }
}