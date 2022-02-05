<%@page import="com.te.dtolayer.SignUp"%>
<%@page import="com.te.dtolayer.BankAccountDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%  response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate"); %>
    <%
    String msg=(String)request.getAttribute("msg");
   
    
    
    %>
<!DOCTYPE html>
<html>
       
<head>
    <style>
        body{ font-size: 75px; }
    </style>
       
    <!-- Add Bootstrap CSS and JS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
     
   
        
    <title>Mobile Details</title>
</head>
   
<body class="p-3 mb-2 bg-success text-white">

<h1>ABI Bank Mobile  Details</h1><br><br>
<div > 
   <h2> <%=msg %></h2> 
     </div>
  
    
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