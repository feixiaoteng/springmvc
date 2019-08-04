<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2019/6/28
  Time: 2:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <fmt:message key="i18n.username"/>
    <form:form action="users/add" modelAttribute="users" method="post">
        姓名:<form:input path="name"/> <form:errors path="name"/>
        <input type="submit" value="提交">


        <form:checkboxes path="sex" items="" element="a"/>
    </form:form>

    <form  method="post" enctype="multipart/form-data">
        <input type="file" name="file"/>
    </form>
</body>
</html>
