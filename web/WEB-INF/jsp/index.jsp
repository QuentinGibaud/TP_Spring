<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html lang="fr-fr">
    <head>
        <title>AuctionMan Connection Page</title>
        <link rel="stylesheet" type="text/css" media="screen" href="css/login.css">
    </head>
    <body>
	<form:form action="listitems.do" method="POST">
            <h1>Auctions Login</h1>
            <p><input type="login" name="login"/></p>
            <p><input type="password" name="passw"/></p>
            <p><button type="submit">Login</button></p>
        </form:form>
    </body>
</html>
