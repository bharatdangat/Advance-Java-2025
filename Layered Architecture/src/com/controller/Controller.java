package com.controller;
import com.employee.Employee;
import com.service.*;
public class Controller
{
   public String insert(Employee emp)throws Exception
   {
	   Service s=new Service();
	   String msg=s.insert(emp);
	   return msg;
   }
}
