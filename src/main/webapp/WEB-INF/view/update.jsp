<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 17-04-2024
  Time: 14:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="nani" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <style>
        .center {
            margin-left: auto;
            margin-right: auto;
        }

        td {
            padding: 15px 25px;
        }
    </style>
</head>
<body>
<h1 style="text-align: center">User Details Update Page</h1>
<div>
    <%--@elvariable id="command" type=""--%>
    <%--@elvariable id="emp" type=""--%>
    <nani:form action="/Spring_MVC_Saurav_war_exploded/saving" modelAttribute="emp">
        <table class="center">
            <tr>
                <td>
                    <label>ID</label>
                </td>
                <td>
                    <nani:input path="employeeId" />
                </td>
            </tr>
            <tr>
                <td>
                    <label>Name</label>
                </td>
                <td>
                    <nani:input path="employeeName"/>
                </td>
            </tr>
            <tr>
                <td>
                    <label>Address</label>
                </td>
                <td>
                    <nani:input path="employeeAddress"/>
                </td>
            </tr>
            <tr>
                <td>
                    <label>Salary</label>
                </td>
                <td>
                    <nani:input path="employeeSalary"/>
                </td>
            </tr>
            <tr>
                <td>
                    <label>Department</label>
                </td>
                <td>
                    <nani:input path="employeeDepartment"/>
                </td>

            </tr>
            <tr>
                <td>
                    <label>Pincode</label>
                </td>
                <td>
                    <nani:input path="employeePincode"/>
                </td>

            </tr>
            <tr>
                <td colspan="2">
                    <nani:button>Submit</nani:button>
                </td>
            </tr>
        </table>

    </nani:form>
</div>
</body>
</html>

