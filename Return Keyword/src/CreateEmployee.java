import java.util.*;
public class CreateEmployee 
{
  ArrayList<Employee> getInfo()
  {
	 ArrayList<Employee> a1=new ArrayList<>();
	 
	 Address add1=new Address("hadapsar","pune");
	 Address add2=new Address("magarrpatta","thane");
	 Address add3=new Address("kandivali","mumbai");
     Employee e1=new Employee(101,"om",add1);
	 Employee e2=new Employee(102,"sai",add2);
     Employee e3=new Employee(103,"ram",add3);

//    e1.setNo(101);
// 	e1.setName("om");
// 	e1.setAddress(add1);
// 	e2.setNo(102);
// 	e2.setName("sai");
// 	e2.setAddress(add2);
// 	e3.setNo(103);
// 	e3.setName("ram");
// 	e3.setAddress(add3);
// 	
     
     a1.add(e1);
	 a1.add(e2);
	 a1.add(e3);
	 return a1;
  }
}
