<%-- 
    Document   : hello
    Created on : 7 mars 2018, 14:16:18
    Author     : Quentin GIBAUD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World <c:out value="${aUser['login']}"/> <c:out value="${aUser['passw']}"/>!</h1>
    </body>
</html>
