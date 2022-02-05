<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%  response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate"); %>
    <% 
    String msg=(String)request.getAttribute("msg");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body class="p-3 mb-2 bg-success text-white">
<h1><%=msg %></h1>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
 
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="./deposit" >Deposit Amount <span class="sr-only"></span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="./withdraw">Withdraw Amount <span class="sr-only"></a>
      </li>
     
      <li class="nav-item active">
        <a class="nav-link" href="./statement" >Bank Statement<span class="sr-only"></span></a>
      </li>
       <li class="nav-item active">
        <a class="nav-link" href="./changepassword" >Change Password<span class="sr-only"></span></a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="./changemobile" >Change Mobile<span class="sr-only"></span></a>
      </li>
        <li class="nav-item active">
        <a class="nav-link" href="./logout" >Logout<span class="sr-only"></span></a>
      </li>
      
      
    </ul>
  </div>
</nav>
</body>
</html>