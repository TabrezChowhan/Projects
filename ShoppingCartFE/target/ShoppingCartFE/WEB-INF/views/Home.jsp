<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/bootstrap.css">  
  <link rel="stylesheet" href="resources/js/bootstrap.js">
  
</head>
<body>
${message}

	<center>
		<h2>Welcome to Shopping Cart</h2>
	</center>
	<a href="LoginPage"> <span class="glyphicon glyphicon-user"></span>  Login</a>
	
	<a href="RegistrationPage"> <span class="glyphicon glyphicon-"></span> Register</a>
	
	<hr color="blue">
	
	<jsp:include page="Menu.jsp"></jsp:include>


<%-- <c:if test="${isAdmin=='true'}">
	
    <jsp:include page="admin/AdminHome.jsp"></jsp:include>

</c:if>

<c:if test="${isAdminClickedCategories=='true'}">

<jsp:include page="admin/Category.jsp"></jsp:include>  

</c:if>

	<c:if test="${isAdminClickedSuppliers=='true'}">
<jsp:include page="admin/Supplier.jsp"></jsp:include> <br>
</c:if>

<c:if test="${isAdminClickedProducts=='true'}">
<jsp:include page="admin/Product.jsp"></jsp:include> <br>
</c:if>
 --%>
<br>
	<c:if test="${isUserClickedLogin=='true'}">

		<jsp:include page="Login.jsp"></jsp:include>

	</c:if>


	<c:if test="${isUserClickedRegister=='true' }">
		<jsp:include page="Registration.jsp"></jsp:include>
	</c:if>


</body>
</html>