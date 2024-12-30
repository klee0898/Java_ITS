<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Products List</title>
</head>
<body>
<h1>제품 목록</h1>
    <ul>
        <c:forEach var="product" items="${prodList}">
            <li>${product}</li>
        </c:forEach>
    </ul>

</body>
</html>