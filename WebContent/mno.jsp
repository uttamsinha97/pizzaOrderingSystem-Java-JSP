<%@page import="com.example.DBCONinsert"%>"
<%@page import="java.sql.*" %>

<html>
<body>
<% String pizzanameu=request.getParameter("pizzanameu"); %>
<% String pizzaquantityu=request.getParameter("pizzaquantityu"); %>
<% ResultSet rs=DBCONinsert.Update1(pizzanameu,pizzaquantityu);
%>
Pizza Updated.
</body>
</html>