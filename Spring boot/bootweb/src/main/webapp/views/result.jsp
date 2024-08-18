<%@page language="java" %>
<html>
<head>
    <title>
        Springboot Web
    </title>
</head>
<body>
<h2>Result</h2>

<p><%= session.getAttribute("result")%></p>
<%--OR You can use..--%>
<p>${result}</p>
</body>
</html>