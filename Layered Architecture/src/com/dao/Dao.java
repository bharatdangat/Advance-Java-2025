package com.dao;
import com.dbconnection.*;
import com.employee.*;
import java.sql.*;
public class Dao 
{
  public String insertRecord(Employee emp)throws Exception
  {
	  Connection con=DataBaseConnection.createDBConnection();
	  String query="insert into employee values(?,?,?)";
	  PreparedStatement pst=con.prepareStatement(query);
	  pst.setInt(1,emp.getEno());
	  pst.setString(2,emp.getEname());
	  pst.setDouble(3,emp.getSalary());
	  pst.executeUpdate();
	  
	  return "Insert record Successfullly...";
  }
}
