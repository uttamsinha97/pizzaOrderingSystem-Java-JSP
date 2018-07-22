<%@page import="com.example.DBCONinsert"%>"
<html>
<body bgcolor="cyan">
<% String pizzanamed=request.getParameter("pizzanamed"); %>
<%=DBCONinsert.delete(pizzanamed)%>
Selected Pizza Deleted!
</body>
</html>