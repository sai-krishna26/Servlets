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

        if(orderFrom==null||orderFrom.trim().isEmpty())
        {
            throw new ServletException("orderFrom is missing");
        }
        else
        {
            System.out.println("orderFrom : " + orderFrom);
        }

        if(item==null||item.trim().isEmpty())
        {
            throw new ServletException("item is missing");
        }
        else
        {
            System.out.println("item : " + item);
        }

        if(quantity==null||quantity.trim().isEmpty())
        {
            throw new ServletException("quantity should not be empty");
        }
        else
        {
            int qnt=Integer.parseInt(quantity);
            if(qnt<=0)
            {
                throw new ServletException("quantity should be greater than 0");
            }
            System.out.println("quantity : " + quantity);
        }

        if(address==null||address.length()<=5||address.trim().isEmpty())
        {
            throw new ServletException("address is missing or not valid");
        }
        else {
            System.out.println("address : " + address);
        }
        servletResponse.setContentType("text/html");
        PrintWriter out =servletResponse.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h3>Order from: " + orderFrom + "|| item: "+item+" Placed Successfully</h3>");
        out.println("</body>");
        out.println("</html>");
    }
}
