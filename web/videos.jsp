<%-- 
    Document   : videos
    Created on : Jun 10, 2019, 1:47:46 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="style2.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        
        <%
            
                response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); //HTTP 1.1
                response.setHeader("Progma", "no-cache"); //HTTP 1.0
                response.setHeader("Expires", "0"); //Proxies
            
                response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
                if(session.getAttribute("username")==null)
                {
                    response.sendRedirect("login.jsp");
                }
        %>
        
        <iframe width="560" height="315" src="https://www.youtube.com/embed/gQLQ0t9B5yk" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
        
    </body>
</html>
