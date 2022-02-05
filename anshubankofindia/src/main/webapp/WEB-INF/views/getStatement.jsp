<%@page import="com.te.dtolayer.MiniStatement"%>
<%@page import="java.util.List"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="com.te.dtolayer.SignUp"%>
<%@page import="com.te.dtolayer.BankAccountDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%  response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate"); %>
    <%
    
     PrintWriter writer=response.getWriter();
    List<MiniStatement> statement=(List<MiniStatement>)request.getAttribute("statement");
    %>
   
<!DOCTYPE html>
<html>
       
<head>
    <style>
        body{ font-size: 75px; }
    </style>
       
    <!-- Add Bootstrap CSS and JS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
     
   
        
    <title>Statement Details</title>
</head>
   
<body class="p-3 mb-2 bg-success text-white">

 <%
    writer.println(" <h1>               ABI Bank Statement Details</h1><br>");
    int i=1;
    if(statement!=null){
    for (Object object : statement) {
    	
    	writer.println("<div>");
		writer.println("<h3>Transaction-"+i+":"+object+"<h3><br><br>");
		writer.println("</div>");
		i++;
    }
    }
    else{
    	writer.println("<h2>Account Number Invalid. Enter A Valid Account Number.............</h2>");
    }
    %>
<br><br>
   <nav class="navbar navbar-expand-lg navbar-light bg-light">
 
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">

        <li class="nav-item active">
        <a class="nav-link" href="./logout" >Logout<span class="sr-only"></span></a>
      </li>
      
      
    </ul>
  </div>
</nav>


</body>
</html>
 

    