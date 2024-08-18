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
<form action="addAlien">
    <label for="aid">Enter ID:</label><br>
    <input type="text" id="aid" name="aid"><br>
    <label for="aname">Enter name:</label><br>
    <input type="text" id="aname" name="aname">
    <button type="submit">Calculate sum</button>
</form>
<a href="/springMvc_war_exploded">Go to index</a>
</body>
</html>