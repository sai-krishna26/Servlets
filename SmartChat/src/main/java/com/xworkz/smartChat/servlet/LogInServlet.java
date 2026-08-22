package com.xworkz.smartChat.servlet;

import com.xworkz.smartChat.dto.LogInDto;
import com.xworkz.smartChat.service.logIn.LogInService;
import com.xworkz.smartChat.service.logIn.LogInServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(loadOnStartup = 1, urlPatterns = "/logIn")
public class LogInServlet extends HttpServlet {

    public LogInServlet()
    {
        System.out.println("created LogInServlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("running doPost() in LogInServlet");
        String username=req.getParameter("username");
        String password=req.getParameter("password");

        String loginUser=req.getParameter("username");
        String registerUser=(String)req.getSession().getAttribute("username");

        if(registerUser==null)
        {
            req.setAttribute("errorMessage","Please register first before logging in");
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("Login.jsp");
            requestDispatcher.forward(req, resp);
            return;
        }
        LogInDto logInDto=new LogInDto(username,password);

        LogInService logInService=new LogInServiceImpl();
        logInService.validateAndSave(logInDto);

        if(loginUser!=null && loginUser.equalsIgnoreCase(registerUser))
        {
            RequestDispatcher dispatcher=req.getRequestDispatcher("Success.jsp");
            dispatcher.forward(req, resp);
        }
        else
        {
            req.setAttribute("errorMessage","username is Invalid");
            RequestDispatcher dispatcher=req.getRequestDispatcher("LogIn.jsp");
            dispatcher.forward(req,resp);
        }
    }
}
