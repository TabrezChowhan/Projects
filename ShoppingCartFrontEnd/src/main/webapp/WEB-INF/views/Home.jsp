<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <meta name="viewport" content="width=device-width, initial-scale=1">
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> 
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>-->
   
 <link rel="stylesheet" href="resources/css/bootstrap.css">
 <script src="resources/js/bootstrap.js"></script>
  
  
</head>
<body>
	<center>
		<h2>Welcome to Shopping Cart</h2>
	</center>
	<%-- ${message}
	<hr color="blue">
 --%>

	<a href="LoginPage"> Login</a>

	<a href="RegistrationPage"> Register</a>
	
<!-- <nav class="navbar navbar-default">
  <div class="container">
    <div class="navbar-header">
     <a class="navbar-brand" href="#">TABBY</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="home.html">Home</a></li>
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Product List
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="Car.html">Car</a></li>
          <li><a href="Bike.html">Bike</a></li>
          <li><a href="Watches.html">Watches</a></li>
        </ul>
      </li>
      <li><a href="ContactUs.html">Contact Us</a></li>
      <li><a href="AboutUs.html">About Us</a></li>
    </ul>
  </div>
</nav> -->

<jsp:include page="Menu.jsp"></jsp:include>
	<c:if test="${isUserClickedLogin=='true'}">

		<jsp:include page="Login.jsp"></jsp:include>

	</c:if>


	<c:if test="${isUserClickedRegister=='true' }">
		<jsp:include page="Registration.jsp"></jsp:include>
	</c:if>








</body>
</html>