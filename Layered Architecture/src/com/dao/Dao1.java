package com.dao;
import com.dbconnection.*;
import com.employee.Employee;

import java.sql.*;
import java.util.ArrayList;
public class Dao1   //DataBase Connectivity
{
 public ArrayList<Employee> getData()
 {
	 ArrayList<Employee> a1=new ArrayList<>();
	 try
	 {
		 Connection con=DataBaseConnection.createDBConnection();
		 String q="select * from employee";
		 PreparedStatement pst=con.prepareStatement(q);
		 ResultSet rs=pst.executeQuery();
		 while(rs.next())
		 {
			 int eno=rs.getInt(1);
			 String ename=rs.getString(2);
			 double salary=rs.getDouble(3);
			 Employee emp=new Employee();
			 emp.setEno(eno);
			 emp.setEname(ename);
			 emp.setSalary(salary);
			 a1.add(emp);
		 }
	 }catch(Exception e)
	 {
		 System.out.println(e.getMessage());
	 }
	 return a1;
 }
}
