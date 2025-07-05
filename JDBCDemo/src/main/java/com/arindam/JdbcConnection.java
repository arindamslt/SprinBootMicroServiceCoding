package com.arindam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class TestConnection
{
	private Connection cn=null;
	private Statement st=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	private String select_sql="select * from student";
	private String insert_sql="insert into student values(?,?,?)";
	private String delete_sql="delete from student where rollno=?";
	private String update_sql="update student set cname=?,dept=? where rollno=?";
	public void getData()
	{
		try
		{
			//Class.forName("com.mysql.cj.jdbc.Driver");
		//	cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","arindam");
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConn();
			st=cn.createStatement();
			rs=st.executeQuery(select_sql);
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"===>"+rs.getString(2)+"===>"+rs.getString(3));
			}
					
			
		}
		/*catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}*/
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public void insertData()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","arindam");
			ps=cn.prepareStatement(insert_sql);
			ps.setString(1,"5");
			ps.setString(2,"NAYAN");
			ps.setString(3,"ECE");
			ps.executeUpdate();
					
			
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public void deleteData()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","arindam");
			ps=cn.prepareStatement(delete_sql);
			ps.setString(1,"5");
			ps.executeUpdate();
					
			
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public void updateData()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","arindam");
			ps=cn.prepareStatement(update_sql);
			ps.setString(3,"4");
			ps.setString(1,"AJOY");
			ps.setString(2,"CIVIL");
			ps.executeUpdate();
					
			
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
}
public class JdbcConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  TestConnection ts=new TestConnection();
  //ts.insertData();
 // ts.deleteData();
  //ts.updateData();
  ts.getData();
	}

}
