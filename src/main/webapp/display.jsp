<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!--untuk menggunakan JSTL, toggle false isELIgnored-->
<html>
    <body>
    <p>using scriptlet</p>
    result (k) = <%= request.getAttribute("result") %>
    <br>
    <br>
    <p>using JSTL</p>
    result (k) = ${result}

    </body>
</html>
