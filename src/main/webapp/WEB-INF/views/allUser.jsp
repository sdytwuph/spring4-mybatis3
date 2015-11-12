<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: wuph
  Date: 2015/11/9
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>用户ID</td>
        <td>用户名</td>
        <td>用户生日</td>
        <td>工资</td>
    </tr>
    <%--遍历lstUsers集合中的User对象 --%>
    <c:forEach var="user" items="${allUser}">
        <tr>
            <td>${user.userId}</td>
            <td>${user.userName}</td>
            <td>${user.userBirthday}</td>
            <td>${user.userSalary}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
