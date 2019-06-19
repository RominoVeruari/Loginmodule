<%-- 
    Document   : wellcome
    Created on : Jun 10, 2019, 1:47:35 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
        <link href="style2.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        
        <%
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); //HTTP 1.1
            response.setHeader("Progma", "no-cache"); //HTTP 1.0
            response.setHeader("Expires", "0"); //Proxies
                if(session.getAttribute("username")==null)
                {
                    response.sendRedirect("login.jsp");
                }
        %>
        <h1> welcome ${username}</h1>
        
        <a href="hometest3.html"> Search for clients </a></br>
        <br><a href="videos.jsp">Videos here </a></br>
        <form action="Logout">
            <input type="submit" value="logout">
        </form>
        
    </body>
</html>
