package com.employee;
import java.util.Scanner;

import com.controller.Controller;
import com.employee.*;
public class MainEmp
{
	public static void main(String[] args)
	{
		try
		{
	 Scanner sc=new Scanner(System.in);
	 Employee employee=new Employee();
	 Controller c=new Controller();
	 System.out.println("Enter Emp No-");
	 int eno=sc.nextInt();
	 System.out.println("Enter Emp Name-");
	 String ename=sc.next();
	 System.out.println("Enter Emp Salary-");
	 Double salary=sc.nextDouble();
	 employee.setEno(eno);
	 employee.setEname(ename);
	 employee.setSalary(salary);
	 //Employee employee=new Employee(102,"sai",780);
	 String msg=c.insert(employee);
	 System.out.println(msg);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
