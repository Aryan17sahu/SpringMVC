<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 30-04-2024
  Time: 09:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <style>
        img
        {
            height: 100px;
        }
        table,th,td{
            border: 2px solid black;
            border-collapse: collapse;
        }
    </style>
</head>
<body>
<table >
    <tr>
        <th>ID</th>
        <th>TITLE</th>
        <th>PRICE</th>
        <th>DESCRIPTION</th>
        <th>CATEGORY</th>
        <th>IMAGE</th>
        <th>RATING</th>



    </tr>
    <c:forEach var="prod" items="${product}">
        <tr>
            <td>${prod.id}</td>
            <td>${prod.title}</td>
            <td>${prod.price}</td>
            <td>${prod.description}</td>
            <td>${prod.category}</td>
            <td><img src="${prod.image}"/></td>
            <td>${prod.getRating()}</td>

        </tr>


    </c:forEach>
</table>
</body>
</html>
