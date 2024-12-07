<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f0f0f0;
        }

        .container {
            width: 300px;
            padding: 20px;
            background-color: #fff;
            margin: 70px auto;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            border-radius: 4px;
        }

        h1 {
            text-align: center;
            margin-bottom: 30px;
        }

        .form-group {
            margin-bottom: 15px;
        }

        label {
            display: block;
            font-weight: bold;
            margin-bottom: 5px;
        }

        input[type="text"],
        input[type="submit"] {
            width: 100%;
            padding: 8px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
            font-size: 14px;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }

        a {
            display: block;
            text-align: center;
            color: #4CAF50;
            text-decoration: none;
            margin-top: 20px;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>

<div class="container">
    <form:form modelAttribute="employee" action="/Spring_MVC_Saurav_war_exploded/save" method="post">
        <h1>Employee Form</h1>
        <div class="form-group">
            <label for="employeeId">Id</label>
            <form:input path="employeeId" id="employeeId"/>
        </div>
        <div class="form-group">
            <label for="employeeName">Name</label>
            <form:input path="employeeName" id="employeeName"/>
        </div>
        <div class="form-group">
            <label for="employeeAddress">Address</label>
            <form:input path="employeeAddress" id="employeeAddress"/>
        </div>
        <div class="form-group">
            <label for="employeeSalary">Salary</label>
            <form:input path="employeeSalary" id="employeeSalary"/>
        </div>
        <div class="form-group">
            <label for="employeeDepartment">Department</label>
            <form:input path="employeeDepartment" id="employeeDepartment"/>
        </div>
        <div class="form-group">
            <label for="employeePincode">Pincode</label>
            <form:input path="employeePincode" id="employeePincode"/>
        </div>
        <input type="submit" name="save" value="Save">
    </form:form>

    <a href="list">Click to show all Data</a>
</div>

</body>
</html>