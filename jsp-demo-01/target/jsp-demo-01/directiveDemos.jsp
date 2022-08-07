<%--
  Created by IntelliJ IDEA.
  Date: 07/08/22
  Time: 10:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" info="servlet info from jsp page" %>
<html>
<head>
    <title>Directive Demos</title>
</head>
<body>
    <%@include file="header.html"%>
    <h3>Directives</h3>
    <ul>
        <li>page</li>
        <li>taglib</li>
        <li>include</li>
    </ul>
<%=getServletInfo()%>
    <%@include file="footer.html"%>
</body>
</html>
