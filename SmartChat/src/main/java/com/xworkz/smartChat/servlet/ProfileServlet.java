package com.xworkz.smartChat.servlet;

import com.xworkz.smartChat.dto.HomeDto;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(loadOnStartup = 1, urlPatterns = "/profile")
public class ProfileServlet extends HttpServlet {

    public ProfileServlet() {
        System.out.println("ProfileServlet created");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running doGet() in ProfileServlet");
        
        HttpSession session = req.getSession();
        HomeDto homeDto = (HomeDto) session.getAttribute("homeDto");
        
        req.setAttribute("homeDto", homeDto);
        
        RequestDispatcher dispatcher = req.getRequestDispatcher("Profile.jsp");
        dispatcher.forward(req, resp);
    }
}
