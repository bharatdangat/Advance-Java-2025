package com.employee;
public class Employee 
{
 private int eno;
 private String ename;
 private double salary;
 //private var acess by using getters and setters(not aceess directly..)
public Employee()
{
	
}
 public Employee(int eno, String ename, double salary) 
{
	super();
	this.eno = eno;
	this.ename = ename;
	this.salary = salary;
}
public int getEno() {
	return eno;
}
public void setEno(int eno) {
	this.eno = eno;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
 
}
