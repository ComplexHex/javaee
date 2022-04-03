<%@ page import="ru.complexhex.JavaEETest.cartPackage.Cart" %><%--
  Created by IntelliJ IDEA.
  User: IMAST
  Date: 4/3/2022
  Time: 6:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show cart</title>
</head>
<body>


<% Cart cart = (Cart) session.getAttribute("cart"); %>

<p> Наименование: <%= cart.getName()%>
</p>
<p> Количество: <%= cart.getQuantity()%>
</p>


</body>
</html>
