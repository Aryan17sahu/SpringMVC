<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Database Center</title>
    <style>
        body {
            font-family: 'Roboto', sans-serif;
            background-color: #f5f5f5;
            color: #333;
            text-align: center;
            padding: 50px;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            box-sizing: border-box;
            background-image: url('https://source.unsplash.com/random/1600x900/?java,office,technology,computer');
            background-size: cover;
            background-position: center;
        }

        h1 {
            font-size: 3rem;
            margin-bottom: 30px;
            text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.3);
        }

        a {
            display: inline-flex;
            margin: 10px;
            padding: 15px 30px;
            background-color: #7d00ff;
            color: white;
            text-decoration: none;
            border-radius: 5px;
            font-weight: bold;
            font-size: 1.2rem;
            align-items: center;
            justify-content: center;
            text-transform: uppercase;
            box-shadow: 2px 2px 4px rgba(0, 0, 0, 0.3);
            transition: all 0.3s ease;
        }

        a:hover {
            background-color: #6a00e8;
            box-shadow: 4px 4px 8px rgba(0, 0, 0, 0.5);
        }

        a:active {
            transform: translateY(2px);
        }
    </style>
</head>
<body>
<div class="container">
    <h1 style="color:#6a00e8">Welcome to the Database center of Employee !</h1>
    <a href="getForm">
        <span>Click Here</span>
        <span class="arrow">&#8594;</span>
    </a>
    <a href="list">
        <span>Show Data</span>
        <span class="arrow">&#8594;</span>
    </a>
    <a href="id">
        <span>Search Employee by Id</span>
        <span class="arrow">&#8594;</span>
    </a>
    <a href="login">
        <span>Click here to login</span>
        <span class="arrow">&#8594;</span>
    </a>
    <a href="logout">
        <span>Click here to logout</span>
        <span class="arrow">&#8594;</span>
    </a>
</div>
</body>
</html>
<%--<%--%>

<%--    response.sendRedirect("login");--%>

<%--%>--%>