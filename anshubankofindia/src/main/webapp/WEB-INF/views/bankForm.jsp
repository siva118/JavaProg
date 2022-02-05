<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%  response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate"); %>
<!DOCTYPE html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <title>ABI Bank Account Creation  Form</title>
</head>
<body class = "bg-dark text-white">
<h3 class="text-center">ABI Bank Account Creation  Form</h3>
<div class="container mt-5">

    <%-- <h3 class="text-center"><%=header %></h3>
    <p class="text-center"><%=description %></p> --%>
    <form action="./createAccount" method="post">
        <div class="mb-3">
            <label for="enterName" class="form-label">Enter Name</label>
            <input type="text" class="form-control" id="EnterName" aria-describedby="emailHelp" placeholder="Enter Name" name="name">
        </div>
        <div class="mb-3">
            <label for="userMobile" class="form-label">Mobile</label>
            <input type="text" class="form-control" id="userMobile" placeholder="Enter Mobile Number" name="phoneNumber">
        </div>
        <div class="mb-3">
            <label for="adharNumber" class="form-label">Adhar Number</label>
            <input type="text" class="form-control" id="adharNumber" placeholder="Enter Adhar Number" name="adharNumber">
        </div>
        <div class="mb-3">
            <label for="userEmail" class="form-label">Email address</label>
            <input type="email" class="form-control" id="userEmail" aria-describedby="emailHelp" placeholder="Enter Email Id" name="mailId">
        </div>
        
        
        <div class="mb-3">
            <label for="Location" class="form-label">Location</label>
            <input type="text" class="form-control" id="location" placeholder="Enter Location" name="location">
        </div>
        <div class="mb-3">
            <label for="depositeAmount" class="form-label">Deposite Amount</label>
            <input type="number" class="form-control" id="depositeAmount" placeholder="Enter Deposite Amount" name="balance">
        </div>

        <button type="submit" class="btn btn-primary">Create Account</button>
    </form>
</div>

<!-- Optional JavaScript; choose one of the two! -->

<!-- Option 1: Bootstrap Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

<!-- Option 2: Separate Popper and Bootstrap JS -->
<!--
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
-->
</body>
</html>