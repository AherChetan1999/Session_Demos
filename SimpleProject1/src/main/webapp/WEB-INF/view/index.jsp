<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  <body>
 <center>
<br/><br/>
<br/>

<h1>DATA</h1>
<a href="/add">New-Data</a> 
&nbsp &nbsp &nbsp
<a href="/show">Show-Data</a> 


<table>
<tr>
<th>Id</th>
<th>Name</th>
<th>Qualification</th>
<th>Placed</th>
<th>Action</th>

</tr>

<tr>
<c:forEach items="${studentlist}" var="sobj">
<tr>
<td>${sobj.getsid()}</td>
<td>${sobj.getsname()}</td>
<td>${sobj.getqualification()}</td>
<td>${sobj.getplaced()}</td>
<td><a href="edit?id=<c:out value='${student.id}' />">Edit</a>
&nbsp;&nbsp;&nbsp;&nbsp;
<a href="delete?id=<c:out value='${student.id}' />">Delete</a> 
</td>

</tr>

</c:forEach>



</table>
</center>



</body>



</html>