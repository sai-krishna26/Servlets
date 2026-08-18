package com.xworkz.msk.servlet;

import com.xworkz.msk.dto.FeedBackDto;
import com.xworkz.msk.service.feedback.FeedBackService;
import com.xworkz.msk.service.feedback.FeedBackServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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

        FeedBackService feedBackService=new FeedBackServiceImpl();
        boolean save=feedBackService.validateAndSave(feedBackDto);
        System.out.println("FeedBackDto: "+feedBackDto);

        if(save)
        {
            RequestDispatcher dispatcher = req.getRequestDispatcher("feedback.jsp");
            req.setAttribute("message","Thank you for your feedback");
            dispatcher.forward(req,resp);
        }
        else {
            System.out.println("feedback data is not saved");
            RequestDispatcher dispatcher=req.getRequestDispatcher("feedback.jsp");
            req.setAttribute("fmessage","Failed to save feedback");
            dispatcher.forward(req,resp);
        }
    }
}
