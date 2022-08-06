<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1 style="color: green">Declaration tag</h1>
<%! int instanceVariable = 100;%>

<h1 style="color: red">Sciptlet tag</h1>
<%
    out.println("Instance variable "+instanceVariable);
%>

<h1 style="color: red">Statement tag</h1>
<%=instanceVariable%>

</body>
</html>
