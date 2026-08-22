package com.xworkz.smartChat.servlet;

import com.xworkz.smartChat.dto.HomeDto;
import com.xworkz.smartChat.service.home.HomeService;
import com.xworkz.smartChat.service.home.HomeServiceImpl;
import lombok.AllArgsConstructor;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(loadOnStartup = 1,urlPatterns ="/home")
@MultipartConfig
public class HomeServlet extends HttpServlet {

    public HomeServlet() {
        System.out.println("HomeServlet created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running doPost() in HomeServlet");
        String name=req.getParameter("name");
        String dateOfBirth=req.getParameter("dateOfBirth");
        String actor=req.getParameter("actor");
        String movie=req.getParameter("movie");
        String ownMovie=req.getParameter("ownMovie");

        Part image=req.getPart("image");
        boolean isImageUploaded=(image!=null && image.getSize()>0);

        HomeDto homeDto=new HomeDto(name, LocalDate.parse(dateOfBirth), actor, movie, ownMovie, isImageUploaded);

        HomeService homeService=new HomeServiceImpl();
        homeService.validateAndSave(homeDto);

        HttpSession session=req.getSession();
        session.setAttribute("homeDto", homeDto);

        RequestDispatcher dispatcher=req.getRequestDispatcher("Upload.jsp");
        dispatcher.forward(req, resp);



    }
}
