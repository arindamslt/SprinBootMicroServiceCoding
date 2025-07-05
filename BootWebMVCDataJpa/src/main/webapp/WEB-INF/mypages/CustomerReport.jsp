<%@page import="com.arindam.service.CustomerService"%>
<%@page import="com.arindam.model.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
  <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CUSTOMER DATA</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
</head>
<body>
<div>
<table class="table table-hover table-striped table-bordered">
<thead class="table-dark">
<tr>
<th>CID</th>
<th>NAME</th>
<th>PHONE NO</th>
</tr>
</thead>
<tbody>
<%
List<Customer> cl=(List<Customer>) session.getAttribute("clist");
    cl.stream().forEach(System.out::println);
    for(Customer c :cl)
    {
       
  %>
  <tr>
  <td><%=c.getCid() %></td>
 <td><%=c.getCname() %></td>
  <td><%=c.getCphno() %></td>
  <%
    }
  %>
</tbody>
</table>
</div>
</body>
</html>