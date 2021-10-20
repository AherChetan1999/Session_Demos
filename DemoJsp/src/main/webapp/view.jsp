<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
ArrayList<Student> al=(ArrayList<Student>)request.getAttribute("studentlist");
for(Student s:al){
	out.println(s.getName()+ "  "+s.qualification());
}

%>


</body>
</html> 