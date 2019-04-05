package com.ayush;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBHelper {
	Connection conn;
	Statement  st;
	PreparedStatement pst;
	final String URL="jdbc:mysql://localhost:3306/indorecity";
	public Connection getMyConnection() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection(URL, "root","ayuaksh");
	}
	public int addEmp(int i,String name,double sal) throws Exception
	{
		conn=getMyConnection();
		st=conn.createStatement();
		String q=String.format("INSERT INTO emp VALUES(%d,'%s',%f)", i,name,sal);
		return st.executeUpdate(q);
	}
	public Emp getEmpInfo(int id) throws Exception
	{
		conn=getMyConnection();
		st=conn.createStatement();
		String q=String.format("SELECT *FROM emp WHERE eid=%d", id);
		ResultSet rs=st.executeQuery(q);
		if(rs.next())
		   return new Emp(rs.getInt(1),rs.getString(2),rs.getDouble(3));
		return null;
	}
	
	

}