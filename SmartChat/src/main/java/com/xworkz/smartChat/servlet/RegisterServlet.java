package com.xworkz.smartChat.servlet;

import com.xworkz.smartChat.dto.RegisterDto;
import com.xworkz.smartChat.service.RegisterService;
import com.xworkz.smartChat.service.RegisterServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(loadOnStartup = 1, urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {

    public RegisterServlet()
    {
        System.out.println("created RegisterServlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("running doPost() in RegisterServlet");
        String username=req.getParameter("username");
        String email=req.getParameter("email");
        String password=req.getParameter("password");
        String confirmPassword=req.getParameter("confirmPassword");

        if(!confirmPassword.equals(password))
        {
            req.setAttribute("errorMessage","passwords do not match, please try again");
            RequestDispatcher dispatcher=req.getRequestDispatcher("Register.jsp");
            dispatcher.forward(req, resp);
            return;
        }

        RegisterDto registerDto=new RegisterDto(username,email,password,confirmPassword);

        RegisterService registerService=new RegisterServiceImpl();
        registerService.validateAndSave(registerDto);


        HttpSession session=req.getSession();
        session.setAttribute("username",username);
        session.setAttribute("password",password);

        RequestDispatcher dispatcher=req.getRequestDispatcher("LogIn.jsp");
        dispatcher.forward(req, resp);

    }
}
