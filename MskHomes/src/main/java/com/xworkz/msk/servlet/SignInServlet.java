package com.xworkz.msk.servlet;

import com.xworkz.msk.dto.SignInDto;
import com.xworkz.msk.service.SignInService;
import com.xworkz.msk.service.SignInServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(loadOnStartup=1,urlPatterns="/signIn")
public class SignInServlet extends HttpServlet {

    public SignInServlet() {
        System.out.println("SignInServlet Constructor is called");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running doPost() in SignInServlet");

        String username=req.getParameter("username");
        String password=req.getParameter("password");

        SignInDto signInDto=new SignInDto(username,password);

        SignInService signInService=new SignInServiceImpl();
        signInService.validateAndSave(signInDto);
        //System.out.println("signInDto:"+signInDto);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("signIn.jsp");

        req.setAttribute("successMessage", "Sign In Completed Successfully ");

        requestDispatcher.forward(req,resp);
    }
}
