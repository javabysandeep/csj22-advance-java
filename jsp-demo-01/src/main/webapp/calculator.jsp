<%@ page import="java.io.PrintWriter" errorPage="error.jsp" %>
Write java code inside the html file

<%
    //scriptlet tag: We can write java code
    int number1 = Integer.parseInt(request.getParameter("number1"));
    int number2 = Integer.parseInt(request.getParameter("number2"));
    String operation = request.getParameter("operation");
    int result = 0;
    switch (operation) {
        case "+":
            result = number1 + number2;
            break;
        case "-":
            result = number1 - number2;
            break;
        case "*":
            result = number1 * number2;
            break;
        case "/":
            result = number1 / number2;
            break;
        case "%":
            result = number1 % number2;
            break;
    }
    out.println("Operation " + operation + " Result " + result);

%>