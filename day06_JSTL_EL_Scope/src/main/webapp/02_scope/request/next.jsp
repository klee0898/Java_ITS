<%@page import="model.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String str = (String)request.getAttribute("strVal");
	Member member = (Member)request.getAttribute("member");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Next Page</h2>
<li>${str}</li> 
<li>${requestScope.strVal}</li>
<li>${requestScope.member.userName}</li>
<li>${requestScope.memner.age}</li>
<hr>

<li>${strVal}</li>
<li>${member.userName}</li>
<li>${memner.age}</li>
</body>
</html>