<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Slydem Wheels</title>
</head>
<body>

<h2>Enroll Your Details</h2>
<form method="post" action="/SpringMVCRedirect/user/details">
<table>
<tr>
<td>First Name</td>
<td><input type="text" name="fname"></td>
</tr>

<tr>
<td>Last Name</td>
<td><input type="text" name="lname"></td>
</tr>

<tr>
<td>Qualification</td>
<td><input type="text" name="qualification"></td>
</tr>

<tr>
<td>PhoneNumber</td>
<td><input type="text" name="number"></td>
</tr>

<tr>
<td>E-mail</td>
<td><input type="text" name="email"></td>
</tr>

<tr>
<td><input type="submit" name="Submit Your Details"></td>
</tr>

</table>

</form>

</body>
</html>