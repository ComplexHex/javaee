<%--
  Created by IntelliJ IDEA.
  User: IMAST
  Date: 4/3/2022
  Time: 9:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
<h1>Testing JSP</h1>

<p>

    <%--    <% Date now = new Date();--%>
    <%--        String someString = "Current date : " + now;--%>
    <%--    %>--%>
    <%--    <%= someString %>--%>

    <%
        for (int i = 0; i < 10; i++) {
            out.println("<p>" + "hello: " + i + "</p>");
        }
    %>

</p>

</body>
</html>
