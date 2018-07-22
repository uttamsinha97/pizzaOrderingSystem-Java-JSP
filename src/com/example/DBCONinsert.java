package com.example;
import java.sql.*;

public class DBCONinsert 
{
	public static Statement st;
	public static Connection con;
	public static Connection getconnection() throws SQLException, ClassNotFoundException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");//registering and loading database
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system1","uttam");
		System.out.println("Connected Successfully.\nWe are using the function getCon for connection");
		return con;
	}
	//insert function
	public static int insert(String pizzaname,String pizzaquantity) throws SQLException, ClassNotFoundException
	{
	con=getconnection();
	st=con.createStatement();
	//st.executeUpdate("create table pizzabox(Name varchar2(20), quantity varchar2(20))");//comment this line when you have already created the table
	return	st.executeUpdate("insert into pizzabox values('"+pizzaname+"','"+pizzaquantity+"')");
	}
	//select function
	public static ResultSet selectAll() throws SQLException, ClassNotFoundException
	{
		con=getconnection();
		st=con.createStatement();
		return st.executeQuery("select * from pizzabox");
	}
	public static int delete(String pizzanamed) throws ClassNotFoundException, SQLException
	{
		con=getconnection();
		st=con.createStatement();
		return st.executeUpdate("delete from pizzabox where Name='"+pizzanamed+"'");
	}
	public static ResultSet selectOne(String pizzanameo) throws SQLException, ClassNotFoundException
	{
		con=getconnection();
		st=con.createStatement();
		return st.executeQuery("select * from pizzabox where Name='"+pizzanameo+"'");
	}
	public static ResultSet Update1(String pizzanameu, String pizzaquantityu) throws SQLException, ClassNotFoundException
	{
		con=getconnection();
		st=con.createStatement();
		return st.executeQuery("update pizzabox set quantity='"+pizzaquantityu+"' where Name='"+pizzanameu+"'");
	}
	
}
