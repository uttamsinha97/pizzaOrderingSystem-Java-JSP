<%@page import="com.example.DBCONinsert"%>"
<%@page import="java.sql.*" %>

<html>
<body bgcolor="pink">
<% String pizzanameo=request.getParameter("pizzanameo"); %>
<% ResultSet rs=DBCONinsert.selectOne(pizzanameo);
while(rs.next())
{
%>
	<%=rs.getString(1)%><br/>
	<%=rs.getString(2)%><br/><br/>
	
	<%
}
%>
</body>
</html>