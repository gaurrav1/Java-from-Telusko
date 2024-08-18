<%@page language="java" %>
<html>
<head>
    <title>
        Springboot Web
    </title>
    <link rel="stylesheet" type="text/css" href="/abc.css">

</head>
<body>
<h2>Hello World!</h2>
<form action="add">
    <label for="fnum">First NO:</label><br>
    <input type="text" id="fnum" name="fnum"><br>
    <label for="snum">Last NO:</label><br>
    <input type="text" id="snum" name="snum">
    <button type="submit">Calculate sum</button>
</form>
<a href="/springMvc_war_exploded/alien">Go to alien</a>
</body>
</html>