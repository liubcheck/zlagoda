<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<style>
    <%@include file='/WEB-INF/views/css/table_dark.css' %>
</style>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form method="post" id="login" class="table_dark" action="${pageContext.request.contextPath}/login"></form>
<h1 class="table_dark">Login as driver:</h1>
<h4 class="table_dark" style="color:red">${errorMessage}</h4>
<table border="1" class="table_dark">
    <tr>
        <th>Email</th>
        <th>Password</th>
        <th>Submit</th>
    </tr>
    <tr>
        <td>
            <input type="text" name="email" form="login" required>
        </td>
        <td>
            <input type="password" name="password" form="login" required>
        </td>
        <td>
            <input type="submit" name="login_employee" form="login" required>
        </td>
    </tr>
</table>
<h5 class="table_dark">
    <a href="${pageContext.request.contextPath}/register">Register new employee</a>
</h5>
</form>
</body>
</html>
