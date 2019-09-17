<%--
  Created by IntelliJ IDEA.
  User: 孙儿子
  Date: 2019/9/17
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
  </head>
  <body>
  首页1111
  <h3>欢迎你:${pageContext.request.getAttribute("username")}</h3>
  <h3>这里是response跳转的用户名:<%=session.getAttribute("username")%></h3>
  <a href="Login.html">点击</a>
  </body>
</html>
