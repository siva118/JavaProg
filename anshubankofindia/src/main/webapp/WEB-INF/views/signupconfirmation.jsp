<%@page import="com.te.dtolayer.SignUp"%>
<%@page import="com.te.dtolayer.BankAccountDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%  response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate"); %>
    <%
    String msg=(String)request.getAttribute("msg");
    SignUp s=(SignUp)request.getAttribute("signup");
    
    
    %>
<!DOCTYPE html>
<html>
       
<head>
    <style>
        body{ font-size: 75px; }
    </style>
       
    <!-- Add Bootstrap CSS and JS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
     
   
        
    <title>Signup Details</title>
</head>
   
<body class="p-3 mb-2 bg-success text-white">

<h1>ABI Bank Signup  Details</h1><br><br>
<div > 
   <h2> <%=msg %></h2> 
     </div>
   <div > 
   <h2>Bank Name :  Anshu Bank Of India</h2> 
     </div>
    <br><br>
    <div > 
   <h2>Branch :  Hyderabad</h2> 
     </div>
    <br><br>
    <div > 
   <h2>IFSC Code : ABIN0001430</h2> 
     </div>
    <br><br>
    <div >  
        <h3>Your Account Number :<%=s.getAccountNumber()%></h3> <br>
    </div>
    <br><br>
      <div >  
        <h3>Your User Name : <%=s.getUserName()%> <br></h3>
    </div >
    <br><br>
     <!-- <div class="d-inline bg-success">  -->
    <div >  
        <h3>Your Mobile Number :  <%=s.getMobile() %></h3><br>
    </div>
    <br><br>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
 
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
     
     
      <li class="nav-item active">
        <a class="nav-link" href="./login" >Login To ABI Bank<span class="sr-only"></span></a>
      </li>
      
    </ul>
  </div>
</nav>

     
</body>
</html>