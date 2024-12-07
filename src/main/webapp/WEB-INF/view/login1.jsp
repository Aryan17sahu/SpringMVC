<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head><title>Login</title></head>
<body>
<center>
    <h1>Login Page</h1>

    <c:if test="${error eq 'true'}"> <font color="red">${msg}</font></c:if>

    <font color="#008b8b">${logOutMsg} </font>

    <form name='loginForm'  action="sec_url" method="post">

        <table>
            <tr>
                <td>User Name:</td>
                <td><input type='text' name='userName' value='' placeholder="Enter User Name">
                </td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><input type='password' name='password' placeholder="Enter Password" />
                </td>
            </tr>
            <tr>
                <td><input name="submit" type="submit"
                           value="submit" />
                </td>
                <td><input name="reset" type="reset" />
                </td>
            </tr>
        </table>

    </form>

</body>
</center>
</html>