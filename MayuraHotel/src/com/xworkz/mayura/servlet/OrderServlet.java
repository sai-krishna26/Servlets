package com.xworkz.mayura.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(loadOnStartup=1,urlPatterns = "/order")
public class OrderServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running service() in OrderServlet");
        String orderFrom = servletRequest.getParameter("orderFrom");
        String item = servletRequest.getParameter("item");
        String quantity = servletRequest.getParameter("quantity");
        String address = servletRequest.getParameter("address");
        System.out.println("orderFrom : " + orderFrom);
        System.out.println("item : " + item);
        System.out.println("quantity : " + quantity);
        System.out.println("address : " + address);

        servletResponse.setContentType("text/html");
        PrintWriter out =servletResponse.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h3>Order from: " + orderFrom + "|| item: "+item+" Placed Successfully</h3>");
        out.println("</body>");
        out.println("</html>");
    }
}
