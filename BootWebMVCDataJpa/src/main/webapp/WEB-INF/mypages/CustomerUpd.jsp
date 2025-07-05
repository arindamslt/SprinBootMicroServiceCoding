<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CUSTOMER UPDATION</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
</head>
<body>
<div style="width:30%;margin:50px auto">
<form action="upd" method="post">
<h3 class="text-dark">CUSTOMER DATA UPDATION FORM</h3>
<input type="text" name="cid" class="form-control" placeholder="ENTER THE CUSTOMER ID">
<input type="text" name="cname" class="form-control" placeholder="ENTER YOUR NAME">
<input type="text" name="cphno" class="form-control" placeholder="ENTER PHONE NUMBER">
<input type="submit" class="btn btn-outline-primary" value="UPDATE">
</form>
</div>
</body>
</html>