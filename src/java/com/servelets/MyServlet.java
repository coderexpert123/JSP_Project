package com.servelets;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet{

    
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("GET Method....");
         resp.setContentType("text/html");
         PrintWriter out=resp.getWriter();
         out.println("<h1>This is my Servlet </h1>");
         
out.print("<h1>Time:"+new Date()+"");
    }
   
}
