package com.xworkz.msk.servlet;

import com.xworkz.msk.dto.FeedBackDto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;

@WebServlet(loadOnStartup = 1,urlPatterns = "/feedback")
public class FeedBackServlet extends HttpServlet {

    public FeedBackServlet()
    {
        System.out.println("FeedBackServlet constructor is called");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String email=req.getParameter("email");
        String mobile=req.getParameter("mobile");
        String comment=req.getParameter("comment");

        FeedBackDto feedBackDto=new FeedBackDto(name,email,mobile,comment);
        System.out.println("FeedBackDto:"+feedBackDto);

        RequestDispatcher dispatcher = req.getRequestDispatcher("feedback.jsp");
        req.setAttribute("message","Thank you for your feedback");
        dispatcher.forward(req,resp);
    }
}
