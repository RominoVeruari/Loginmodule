<%-- 
    Document   : login
    Created on : Jun 10, 2019, 1:47:24 PM
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
        
        <div class="button">
            <a href="index1.html" class="btn btn-home"> Home </a>
        </div>
        <h1>
        <form action="Login" method="post">
            Enter Username  :<input type="text" name="uname" </br>
            </br> Enter Password  :<input type="password" name="pass" </br>
            <br><input type="submit" value="login"></br>
        </form>
        </h1>
            
    </body>
</html>
