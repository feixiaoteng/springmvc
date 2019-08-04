<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2019/6/28
  Time: 11:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
    <br><br>
    <a href="/users/1">TES REST GET</a>
    <br><br>
    <form action="/users" method="post">
        <input type="submit" value="TES REST POST">
    </form>
    <br><br>
    <form action="/users" method="post">
        <input type="hidden" name="_method" value="DELETE">
        <input type="submit" value="TES REST DELETE">
    </form>
    <br><br>
    <form action="/users" method="post">
        <input type="hidden" name="_method" value="PUT">
        <input type="submit" value="TES REST PUT">
    </form>
    <br><br>
</body>
</html>
