<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="p" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 
String user=(String)request.getAttribute("user");
out.println("user from scriptlet "+user);
%>
<br/>
<%="user from expression "+request.getAttribute("user") %>

<br/>
${user}
<br/>

<h3>myLIst</h3>
<ol>
<p:forEach items="${myList}" var="obj">

<li>${obj}</li>

</p:forEach>

</ol>
</body>
</html>