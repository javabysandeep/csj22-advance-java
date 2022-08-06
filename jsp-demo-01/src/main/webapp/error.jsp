<%@ page isErrorPage="true" %>
<h2 style="color: red">
    <%
        out.println(exception.getMessage());
    %>
</h2>