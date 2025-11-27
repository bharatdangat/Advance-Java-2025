package com.employee;
import java.util.ArrayList;

import com.controller.*;
public class MainEmp2
{
	public static void main(String[] args)
	{
	 MainEmp2 ob=new MainEmp2();
	 Employee e=new Employee();
	 Controller1 cc=new Controller1();
     ArrayList<Employee> a=cc.getInfo();
     for(Employee emp:a)
     {
    	 System.out.println("Employee No-"+emp.getEno());
    	 System.out.println("Employee Name-"+emp.getEname());
    	 System.out.println("Employee Salary-"+emp.getSalary());
    	 System.out.println("________________________________");
     }
	}

}
