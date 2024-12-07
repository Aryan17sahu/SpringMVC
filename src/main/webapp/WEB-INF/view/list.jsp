<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employees List</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f0f0f0;
        }

        .container {
            width: 80%;
            margin: 0 auto;
            padding: 20px;
            box-sizing: border-box;
        }

        h1 {
            text-align: center;
            margin-bottom: 30px;
            color: #4CAF50;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            background-color: #fff;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            border-radius: 4px;
            overflow: hidden;
        }

        th,
        td {
            padding: 15px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #4CAF50;
            color: white;
            font-weight: bold;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        a {
            display: block;
            text-align: center;
            color: #4CAF50;
            text-decoration: none;
            margin-top: 20px;
            padding: 5px;
            border-radius: 4px;
            background-color: #f2f2f2;
        }

        a:hover {
            background-color: #ddd;
        }

        .back-link {
            display: block;
            text-align: center;
            color: #fff;
            text-decoration: none;
            margin-top: 30px;
            padding: 10px 20px;
            border-radius: 4px;
            background-color: #4CAF50;
        }

        .back-link:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>

<div class="container">
    <h1>Employees List</h1>
    <table>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Address</th>
            <th>Salary</th>
            <th>Department</th>
            <th>Pincode</th>
            <th>Delete</th>
            <th>Update</th>
        </tr>

        <c:forEach var="user" items="${list}">
        <tr>
            <td>${user.employeeId}</td>
            <td>${user.employeeName}</td>
            <td>${user.employeeAddress}</td>
            <td>${user.employeeSalary}</td>
            <td>${user.employeeDepartment}</td>
            <td>${user.employeePincode}</td>
            <td><a href="delete/${user.employeeId}">Delete</a></td>
            <td><a href="update/${user.employeeId}">Update</a></td>
        </tr>
        </c:forEach>

