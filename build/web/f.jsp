<%-- 
    Document   : f
    Created on : 07-Jun-2022, 9:21:32 AM
    Author     : Nishant Singh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.util.Random" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color: lightblue">
        <h1>Hello World!</h1>
        
        <%!
        int a=8;
        int b=9;
        
        public int doSum(){

        return a+b;

        }



        %>
        
        
        <%
            
out.println(a);
out.println(b);
out.print("<br>");

out.print("The Sum is: "+doSum());

            
        %>
        <h1>
           Random Number :
           <%
            Random r=new Random();
            int n=r.nextInt(10);
            
           %>
           <%= n %>
        </h1>
        <h1 style="color: red"><%= doSum() %></h1>
        
        
        
 <%@include file="header.jsp" %>  


    </body>
    

</html>
