<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:if test="${user='chetan'}">
<h1>welcome chetan</h1>
</c:if>
<table border=1>
<tr> 
<td>Id</td>
<td>Name</td>
<td>Qualification</td>
<td>Placed</td>



</tr>
<c:forEach items="${studentlist}" var="sobj">
<tr>
<td>${sobj.getsid()}</td>
<td>${sobj.getsname()}</td>
<td>${sobj.getqualification()}</td>
<td>${sobj.getplaced()}</td>


</tr>

</c:forEach>
</table>

</body>
</html>