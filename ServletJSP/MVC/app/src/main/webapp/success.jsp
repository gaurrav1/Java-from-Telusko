<%@ page session="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Woww!</title>
</head>
<body>
    <%
        session = request.getSession(false); // false to not create a new session if it doesn't exist
        String username = (session != null) ? (String) session.getAttribute("username") : null;
    %>
    Registered successfully!
    <br>
    <h2> &#x1FAAA; Welcome  
    <%= username != null ? username : "" %>
    </h2>
</body>
</html>
