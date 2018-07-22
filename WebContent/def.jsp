<%@page import="com.example.DBCONinsert" %>
<html>
<body bgcolor="yellow">
<%String pizzaname=request.getParameter("pizzaname") ;
String pizzaquantity=request.getParameter("pizzaquantity");
%>
<%=DBCONinsert.insert(pizzaname,pizzaquantity)
%>
Pizza Details Added Successfully!
</body>
</html>