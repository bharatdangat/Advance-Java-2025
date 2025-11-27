package com.dbconnection;
import java.sql.*;
public class DataBaseConnection //Dtabase Connection
{
  private static final String url="jdbc:mysql://localhost:3306/bharat";
  private static final String user="root";
  private static final String password="root";
  
  //method will be static hence not used object for calling and call directly using class.. 
  public static Connection createDBConnection()
  {
	  Connection con=null;
	  try
	  {
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  con=DriverManager.getConnection(url, user, password);
	  }catch(Exception e)
	  {
		  System.out.println(e.getMessage());
	  }
	  return con;
  }
  
}
