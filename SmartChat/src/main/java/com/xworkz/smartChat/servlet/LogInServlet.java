package com.xworkz.smartChat.servlet;

import com.xworkz.smartChat.dto.LogInDto;

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

        String confirmUser=req.getParameter("");

        LogInDto logInDto=new LogInDto(username,password);

    }
}
