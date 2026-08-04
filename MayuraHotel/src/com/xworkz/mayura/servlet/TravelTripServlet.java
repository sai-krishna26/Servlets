package com.xworkz.mayura.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

@WebServlet(loadOnStartup =1,urlPatterns = "/trip")
public class TravelTripServlet extends HttpServlet {

    public TravelTripServlet() {
        System.out.println("TravelTripServlet constructor is called");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("TravelTripServlet doPost() is called");
        String destname = req.getParameter("destname");
        String trvldate = req.getParameter("trvldate");
        String rtrndate = req.getParameter("rtrndate");
        String nooftrvrs = req.getParameter("nooftrvrs");
        String budget = req.getParameter("budget");
        String transportmode = req.getParameter("transportmode");

        System.out.println("destname:"+destname);
        System.out.println("trvldate:"+trvldate);
        System.out.println("rtrndate:"+rtrndate);
        System.out.println("nooftrvrs:"+nooftrvrs);
        System.out.println("budget:"+budget);
        System.out.println("transportmode:"+transportmode);

        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        LocalDate convertedTrvldate = LocalDate.parse(trvldate);
        LocalDate convertedRtrndate = LocalDate.parse(rtrndate);

        if(!convertedTrvldate.isBefore(convertedRtrndate))
        {
            resp.getWriter().println("<h2>Maga yav Branduu?:Travel Date kinta munche Return Date select madidhiya!</h2>");
            return;
        }
        if(nooftrvrs == null || nooftrvrs.isEmpty() || nooftrvrs.equals("0"))
        {
            resp.getWriter().println("<h2>Maga yav Branduu?:Yaru barthane ilva?, O anta kottidhiya!</h2>");
            return;
        }
        if(budget == null || budget.isEmpty() || budget.equals("0"))
        {
            resp.getWriter().println("<h2>Maga yav Branduu?:budget 0 madhidhiyallo punyathma!!</h2>");
            return;
        }
        if(transportmode == null || transportmode.isEmpty())
        {
            resp.getWriter().println("<h2>Maga yav Branduu?:Nadkond hegbeku ankondidhiya?, transport mode kaali hoditidhe!</h2>");
            return;
        }

        out.println("<h2>Jeevandhalli first time olle kelsa madidhiya bidu!!.</h2>");
        out.println("<h2>Trip plan mugitu, duddhu arrange madkoli</h2>");
        out.println("<h2>Special Note:duddu illa, mane yalli bidtilla, husharilla anta helo haagilla koneyalli!!</h2>");
        out.println("<br>");
        out.println("<br>");
        out.println("<a href='index.html'>Home</a>");
        out.println("</body>");
        out.println("</html>");


    }
}
