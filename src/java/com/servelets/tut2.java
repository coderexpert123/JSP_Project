package com.servelets;
 
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class tut2 extends GenericServlet{

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
  
    
     System.out.println("Servicing...");
        res.setContentType("text/html");
           PrintWriter out=res.getWriter();
           out.println("<h1>This is my Generic Servlet </h1>");
                   out.println("<h1>Today Date | Generic : "+new Date().toString()+" </h1>");

    }
    
}
