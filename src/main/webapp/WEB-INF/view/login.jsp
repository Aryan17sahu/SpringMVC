<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 18-04-2024
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Login Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        .container {
            width: 300px;
            padding: 16px;
            background-color: white;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        .container input[type=text], .container input[type=password] {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            box-sizing: border-box;
        }
        .container button {
            background-color: #4CAF50;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            cursor: pointer;
            width: 100%;
            border-radius: 4px;
        }
        .container button:hover {
            opacity: 0.8;
        }
        .container .error {
            color: red;
            margin-top: 10px;
            font-size: 14px;
        }
    </style>
</head>
<body>
<div class="container">
    <form:form action="submitForm" modelAttribute="employee" method="post">
        <label for="employeeName">User Name</label>
        <input type="text" name="employeeName" />

        <label for="employeeDepartment">Password</label>
        <input type="password" name="employeeDepartment" />

        <button type="submit">Submit</button>
        <div class="error">${error}</div>
    </form:form>
</div>
<a href="index.jsp">Back To HomePage</a>
</body>
</html>