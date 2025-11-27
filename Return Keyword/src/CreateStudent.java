import java.util.ArrayList;

public class CreateStudent 
{
   ArrayList<Student> getInfo()
  {
	  ArrayList<Student> a1=new ArrayList<>();
	  
	  Marcks m1=new Marcks(95,67);
	  Marcks m2=new Marcks(93,78);
	  Marcks m3=new Marcks(86,76);
	  Marcks m4=new Marcks(89,87);
	  
	  Student s1=new Student(101,"om", m1);
	  Student s2=new Student(102,"sai", m2);
	  Student s3=new Student(103,"ram", m3);
	  Student s4=new Student(104,"sham", m4);
	  
	  a1.add(s1); a1.add(s2); a1.add(s3); a1.add(s4);
	  return a1;
  }
}
