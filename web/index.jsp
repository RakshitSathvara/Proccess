<%-- 
    Document   : index
    Created on : 19 Jan, 2015, 10:53:44 PM
    Author     : Rakshit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <form method="post" action="HelloServlet">
            User Name:<input type="text" name="uname"/>
            Password: <input type="password" name="password"/>
            <input type="submit" name="btnLogin" value="Sign In" />
        </form>
    </body>
</html>
