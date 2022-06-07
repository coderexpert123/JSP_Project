package com.servelets;  

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{

protected void doPost(HttpServletRequest req, 
        HttpServletResponse resp) throws ServletException, IOException {

       resp.setContentType("text/html");
       PrintWriter out=resp.getWriter();
       out.println("<h1>Register</h1>");

    String name=req.getParameter("username");
    String pass=req.getParameter("password");
    String email=req.getParameter("email");
 
  out.println("User Name: "+name);
  out.println("Passwordd is: "+pass);
  out.println("Email is "+email);
}
    
}
