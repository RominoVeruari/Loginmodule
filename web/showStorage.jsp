<%-- 
    Document   : showStorage
    Created on : May 31, 2019, 2:37:18 PM
    Author     : User
--%>

<%@page import="com.Test2.Storage"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="style3.css" rel="stylesheet" type="text/css">
    </head>
    <body >
        <!--
            Storage a = (Storage)request.getAttribute("data");
            out.println(a);
           
        -->
        
        <%
            
            Storage a = (Storage)session.getAttribute("data");
            out.println(a);
            %>
        
    </body>
</html>
