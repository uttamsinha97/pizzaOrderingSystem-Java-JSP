<%@page import="com.example.DBCONinsert" %>
<%@page import="java.sql.*" %>
<html>
<body bgcolor="yellow">
<% ResultSet rs=DBCONinsert.selectAll();
while(rs.next())
{
%>
	<%=rs.getString(1)%><br/>
	<%=rs.getString(2)%><br/><br/>
	
	<%
}
%>