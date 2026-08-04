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

        servletResponse.setContentType("text/html");
        PrintWriter out = servletResponse.getWriter();

        if(orderFrom==null||orderFrom.trim().isEmpty())
        {
            out.println("<html><body><h3>Error: orderFrom is missing</h3></body></html>");
            return;
        }
        else
        {
            out.println("orderFrom : " + orderFrom);
        }

        if(item==null||item.trim().isEmpty())
        {
            out.println("<html><body><h3>Error: item is missing</h3></body></html>");
            return;
        }
        else
        {
            out.println("item : " + item);
        }

        if(quantity==null||quantity.trim().isEmpty())
        {
            out.println("<html><body><h3>Error: quantity should not be empty</h3></body></html>");
            return;
        }
        else
        {
            int qnt=Integer.parseInt(quantity);
            if(qnt<=0)
            {
                out.println("<html><body><h3>Error: quantity should be greater than 0</h3></body></html>");
                return;
            }
            out.println("quantity : " + quantity);
        }

        if(address==null||address.length()<=5||address.trim().isEmpty())
        {
            out.println("<html><body><h3>Error: address is missing or not valid</h3></body></html>");
            return;
        }
        else {
            out.println("address : " + address);
        }

        out.println("<html>");
        out.println("<body>");
        out.println("<h3>Order from: " + orderFrom + "|| item: "+item+" Placed Successfully</h3>");
        out.println("</body>");
        out.println("</html>");
    }
}