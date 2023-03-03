<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>Employee Register form </h1>
<Form action="<%= request.getContextPath() %>/register" method ="post">
<table style = "with:80%">

<tr>
<td>Id</td>
<td> <input type="text" name="Id"/> </td>
</tr>

<tr>
<td>First Name</td>
<td> <input type="text" name="firstName"/> </td>
</tr>

<tr>
<td>Address</td>
<td> <input type="text" name="Address"/> </td>
</tr>

<tr>
<td>Gender</td>
<td> <input type="radio" name="Gender" value="male"> male
 <input type="radio" name="Gender" value="female"> female</td>
</tr>

<tr>
<td>salary</td>
<td> <input type="text" name="Salary"/> </td>
</tr>

<tr>
<td>DOB</td>
<td> <input type="date" name="DOB"/> </td>
</tr>

</table><br><br>

<input type ="submit" value="Submit"/>


</Form>
</div>
</body>
</html>