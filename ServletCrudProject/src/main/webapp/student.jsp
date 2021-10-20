<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>
<tr>
<th>Id</th>
<th>Name</th>
<th>Qualification</th>
<th>Placed</th>
<th>Action</th>

</tr>

</tr>
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

</body>
</html>