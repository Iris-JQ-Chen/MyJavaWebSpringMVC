<%--
  Created by IntelliJ IDEA.
  User: 蒲公英之流
  Date: 2019-07-17
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
    ${method}
    <form action="register" method="Post">
        用户名：<input type="text" name="username"/>
        密&nbsp;&nbsp;码<input type="text" name="password"/>
        年&nbsp;&nbsp;龄<input type="number" name="age"/>
        <input type="submit" value="注册"/>
    </form>
</body>
</html>
