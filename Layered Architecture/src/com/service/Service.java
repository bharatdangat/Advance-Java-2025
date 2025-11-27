package com.service;
import com.dao.*;
import com.employee.*;
public class Service
{
  public String insert(Employee emp)throws Exception
  {
	  String msg=null;
	  Dao d=new Dao();
	  if(!emp.getEname().equals("Adi"))
	  {
	   msg=d.insertRecord(emp);
	  }
	  else
	  {
		 return "We Not Insert Adii Name ";
	  }
	  return msg;
  }
  
}
