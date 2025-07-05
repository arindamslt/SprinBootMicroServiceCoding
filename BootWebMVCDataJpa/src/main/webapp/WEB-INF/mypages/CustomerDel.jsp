<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CUSTOMER DELETION</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
</head>
<body>
<div style="width:30%;margin:50px auto">
<form action="/del" method="post">
<h3 class="text-dark">CUSTOMER DELETION FORM</h3>
<input type="text" name="cid" class="form-control" placeholder="ENTER THE CUSTOMER ID">
<input type="submit" class="btn btn-outline-primary" value="DELETE">
</form>
</div>
</body>
</html>