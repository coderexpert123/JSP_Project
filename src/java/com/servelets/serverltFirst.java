package com.servelets;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;
public class serverltFirst implements Servlet{

ServletConfig conf;

 
    public void init(ServletConfig config){
        this.conf=conf;
        System.out.println("Creating object");
     }

      
       public void service(ServletRequest req,ServletResponse resp)throws ServletException,IOException{
       
        System.out.println("Servicing...");
        resp.setContentType("text/html");
           PrintWriter out=resp.getWriter();
           out.println("<h1>This is my First Servlet </h1>");
                   out.println("<h1>Today Date: "+new Date().toString()+" </h1>");

     }     
 
    public void destroy() {
        System.out.println("Destroy");
          //To change body of generated methods, choose Tools | Templates.
    }
    public ServletConfig getServletConfig(){
      return this.conf;
      
    }
    
    public String getServletInfo(){
        return "good";
    }
}
