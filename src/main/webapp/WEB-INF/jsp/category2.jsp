<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=windows-1255"
    pageEncoding="windows-1255"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
   <link rel="stylesheet" href="newTest.css">
  
</head>
<body>

<div class="jumbotron">
  <div class="container text-center">
    <h1>Furniture Store </h1>      
    <p>Only best furniture in the Israel</p>
  </div>
</div>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">Logo</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Home</a></li>
        <li><a href="#">Products</a></li>
        <li><a href="#">Deals</a></li>
        <li><a href="#">Stores</a></li>
        <li><a href="#">Contact</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-user"></span> Your Account</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
      </ul>
    </div>
  </div>
</nav>



<div class="container">    
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary">
         <div class="panel-heading">Supplier</div>
     <a href="addsupplier">New</a>     
<table class="table-bordered">
   <thead>
<tr><TH>Id Supplier</TH><TH>Name Supplier</TH><TH>City</TH><TH>Phone Number</TH><TH>Delete</TH><TH>Update</TH></tr>
      
    </thead>
    <tbody>
    <c:forEach items="${reshimaSapak}" var="sapak">
      <tr>
          <td><c:out  value="${sapak.supplierId}"/></td>
          <td><c:out  value="${sapak.name}"/></td>  
            <td><c:out  value="${sapak.city}"/></td>  
             <td><c:out  value="${sapak.phoneNum}"/></td>    
           <td>
           <a href="category2/deletesupplier/<c:out  value="${sapak.supplierId}"/>">מחיקה</a>
            
          </td>
            <td>
             <a href="category2/updatesupplier/<c:out  value="${sapak.supplierId}"/>">עדכון</a>
          </td>
      
      </tr>
      </c:forEach>
    </tbody>
</table>
<!--         <div class="panel-footer">Buy 50 mobiles and get a gift card</div>
 -->      </div>

    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-primary">
        <div class="panel-heading">Category</div>
     <a href="addcategory">New</a>
         
<table class="table-bordered">
   <thead>
      <tr><TH>Id Category </TH><TH>Name Category</TH><TH>Delete</TH><TH>Update</TH></tr>
      
    </thead>
    <tbody>
    <c:forEach items="${reshima}" var="degem">
      <tr>
          <td><c:out  value="${degem.id}"/></td>
          <td><c:out  value="${degem.name}"/></td>
         
           <td>
           <a href="category2/delete/<c:out  value="${degem.id}"/>">מחיקה</a>
              
          </td>
            <td>
             <a href="category2/update/<c:out  value="${degem.id}"/>">עדכון</a>
          </td>
            </tr>
      </c:forEach>
    </tbody>
</table>
<!--         <div class="panel-footer">Buy 50 mobiles and get a gift card</div>
 -->      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-primary">
      <div class="panel-heading">Items</div>
     <a href="additem">New</a>
         
<table class="table-bordered">
   <thead>
      <tr><TH>ID Item </TH><TH>Name Item </TH><TH> Warehouse </TH><TH> Supplier</TH>
      <TH>Category</TH><TH>Delete</TH><TH>Update</TH></tr>
      
    </thead>
    <tbody>
    <c:forEach items="${reshimaItem}" var="parit" >
      <tr>
          <td><c:out  value="${parit.itemId}"/></td>
          <td><c:out  value="${parit.itemName}"/></td>
         <td><c:out  value="${parit.warehouse}"/></td>
           <td><c:out  value="${parit.supplier.name}"/></td>
          <td><c:out  value="${parit.category.name}"/></td>  
       
           <td>
           <a href="category2/deleteItem/<c:out  value="${parit.itemId}"/>">מחיקה</a>
          
          
          </td>
            <td>
             <a href="category2/updateItem/<c:out  value="${parit.itemId}"/>">עדכון</a>
          </td>
      
      </tr>
      </c:forEach>
      
    </tbody>
</table>
<!--         <div class="panel-footer">Buy 50 mobiles and get a gift card</div>
 -->      </div>
      </div>
    </div>
  </div>
</div><br><br>

<footer class="container-fluid text-center">
  <p>Online Store Copyright</p>  
  <form class="form-inline">Get deals:
    <input type="email" class="form-control" size="50" placeholder="Email Address">
    <button type="button" class="btn btn-danger">Sign Up</button>
  </form>
</footer>

</body>
</html>
