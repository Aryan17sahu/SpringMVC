<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 18-04-2024
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Login Successful</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            padding: 20px;
        }
        h1 {
            color: #4CAF50;
            font-size: 2rem;
            margin-bottom: 20px;
        }
        a {
            display: inline-block;
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            text-decoration: none;
            border-radius: 4px;
            margin-top: 20px;
        }
        a:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
<h1>Login failed</h1>
<p>${msg}</p>
<a href="index.jsp">Back to Homepage </a>
</body>
</html>