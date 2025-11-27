package com.controller;
import java.util.ArrayList;
import com.employee.Employee;
import com.service.*;
public class Controller1 //Requst Handling...
{
  public ArrayList<Employee> getInfo()
  {
	Service1 s=new Service1();
	ArrayList<Employee> a=s.getInfo();
	return a;
  }
}
