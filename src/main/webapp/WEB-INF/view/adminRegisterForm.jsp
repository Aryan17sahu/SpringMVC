<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 06-05-2024
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--@elvariable id="admin" type=""--%>
<form:form action="saveAdmin" modelAttribute="admin" >
<table>
    <tr>
        <th>ID</th>
        <th>USERNAME</th>
        <th>PASSWORD</th>
        <th>ROLE</th>
    </tr>

      <tr>
         <td> <form:input path="id"/></td>
          <td>  <form:input path="userName"/></td>
          <td>  <form:input path="password"/></td>
          <td> <form:input path="role"/></td>
      </tr>

    </form:form>

</table>
<input type="submit" value="Insert">
</body>
</html>
