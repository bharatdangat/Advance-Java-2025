import java.util.ArrayList;

public class MainEmp
{
	public static void main(String[] args)
	{
	 CreateEmployee ob=new CreateEmployee();
	 ArrayList<Employee> a=ob.getInfo();
	 for(Employee e:a)
	 {
		 System.out.println("Employee No-"+e.getNo());
		 System.out.println("Employee Name-"+e.getName());
		 System.out.println("Employee Home Address-"+e.getAddress().homeaddr);
		 System.out.println("Employee Office  Address-"+e.getAddress().homeaddr);
		 System.out.println("**************************************************");
	 }
	}
}
