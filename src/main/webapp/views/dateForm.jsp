<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>display date</title>
</head>
<body>
 <center>
  <h2>Display date form</h2>
  <!-- ones user click on submit button request will get send to /date -->
   <form action="displaydate">
   <input placeholder="Enter Username" name="user">
   <br><br>
   	<input type="submit" value="Date">
   </form>
   
   
   <hr>
   
   
   <h2>Login of Student</h2>
   <form action="performLogin">
   <input placeholder="Enter RollNo" name="rn" >
   <br><br>
    <input type="submit" value="Login">
   </form>
  </center>
</body>
</html>