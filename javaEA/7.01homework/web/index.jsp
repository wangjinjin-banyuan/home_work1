<%--
  Created by IntelliJ IDEA.
  User: edz
  Date: 2020/7/1
  Time: 6:53 下午
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.util.*,java.text.*" contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  $END$
  <%=request.getParameter("loginName")
  %>
  <br/>
  <%=request.getAttribute("errorMsg")%>
  </body>
</html>
