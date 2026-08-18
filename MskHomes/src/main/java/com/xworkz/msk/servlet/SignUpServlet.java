package com.xworkz.msk.servlet;

import com.xworkz.msk.dto.SignUpDto;
import com.xworkz.msk.service.signOut.SignUpService;
import com.xworkz.msk.service.signOut.SignUpServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(loadOnStartup=1, urlPatterns="/signUp")
public class SignUpServlet extends HttpServlet {

        public SignUpServlet()
        {
            System.out.println("SignUpServlet constructor is called");
        }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("running doPost() in SignUpServlet");

        String username=req.getParameter("username");
        String email=req.getParameter("email");
        String password=req.getParameter("password");
        String confirmPassword=req.getParameter("confirmPassword");

        if(!password.equals(confirmPassword))
        {
            req.setAttribute("errorMessage","passwords do not match");
            RequestDispatcher dispatcher=req.getRequestDispatcher("signUp.jsp");
            dispatcher.forward(req, resp);
            return;
        }

        SignUpDto signUpDto=new SignUpDto(username,email,password,confirmPassword);

        SignUpService signUpService=new SignUpServiceImpl();
        boolean result=signUpService.validateAndSave(signUpDto);
        System.out.println("signUpDto:"+signUpDto);

        if(result) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("signUp.jsp");
            req.setAttribute("successMessage", "Sign Up Completed Successfully ");
            requestDispatcher.forward(req, resp);
        }
        else
        {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("signUp.jsp");
            req.setAttribute("errorMessage", "Sign Up Failed");
            requestDispatcher.forward(req, resp);
        }
    }
}
