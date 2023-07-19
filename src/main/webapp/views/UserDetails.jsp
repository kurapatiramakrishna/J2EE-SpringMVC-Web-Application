<%@page import="org.jsp.springMVC.entity.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UserDetails</title>
</head>
<body>
<center>
	<h1>Executed file Without File Extension...</h1>
	<h1>Forget Password Webpage</h1>
	
		<%int page1 = (Integer) request.getAttribute("pageNo");
	Student s1 = (Student) request.getAttribute("object");%>
	
	<h1>Page Number : <%= page1%></h1>
	<h1>Roll Number : <%=s1.getRollNo()%></h1>
	<h1>Name : <%=s1.getName() %></h1>
	<h1>Percentage : <%=s1.getPercentage() %></h1>
	<h1>Stream : <%=s1.getStream()%></h1>
</center>
</body>
</html>