<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("APP_PATH",request.getContextPath());
%>
<html>
    <head>
    <title>index页</title>
        <script type="text/javascript" src="${APP_PATH}/js/jquery-1.5.2.min.js"></script>

    </head>
    <body onload="load();">
    <form action="${APP_PATH}/login.controller" method="post">
        <input type="text" name="username" id="username"><br>
        <input type="password" name="password">
        <input type="submit" value="提交" id="buton">
    </form>
</body>

</html>
