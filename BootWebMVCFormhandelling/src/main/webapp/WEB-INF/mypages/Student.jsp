<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>STUDENT FORM</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>

</head>
<body>
<form action="register" method="post">
<div style="width:30%;margin:50px auto;">
<h3 class="text-white bg-dark">STUDENT REGISTRATION FORM</h3>
<input type="text" name="rollno" class="form-control"  placeholder="ENTER YOUR ROLLLNO">
<input type="text" name="sname" class="form-control"  placeholder="ENTER YOUR NAME">
<input type="text" name="dept" class="form-control"  placeholder="ENTER YOUR DEPARTMENT">
<input type="submit" class="btn btn-outline-primary" style="margin:10px auto" value="REGISTER">
</div>
</form>
</body>
</html>