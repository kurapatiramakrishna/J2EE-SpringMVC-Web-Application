<%@page import="org.jsp.springMVC.entity.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>main page login</title>
</head>
<body>
 <h2>Student portal</h2>
 <%
 Student s1=(Student) request.getAttribute("studentObject");
 if(s1!=null)
 {
 %>
 <h2>RollNo = <%=s1.getRollNo() %></h2>
 <h2>Name = <%=s1.getName() %></h2>
 <h2>Percentage = <%=s1.getPercentage() %></h2>
 <h2>Stream = <%=s1.getStream() %></h2>
 <%
 } else {
 %>
 <h1 style="color:red;">Invalid Roll Number</h1>
 <%
 }
 %>
</body>
</html>