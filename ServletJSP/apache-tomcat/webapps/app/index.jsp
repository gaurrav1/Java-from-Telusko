<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome</title>
    <style>
        body{
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background-color: #f4f4f4;
        }
        h1 {
            color: cadetblue;
            display: block;
        }
        span {
            color: rgb(117, 5, 5);
        }
    </style>
</head>
<body>
    <%@ page import="java.util.Date" %>
    <%! int age = 18;
        Date date = new Date();
        Date getDate() {
            System.out.println("getDate() called");
            return date;
        }
    %>

    <h1>Welcome! </h1>
    <span>Today is: <%= date %></span>
    what is your age? <%= age %>
</body>
</html>
