
import com.controller.Controller;
import com.employee.*;
public class MainEmp
{
	public static void main(String[] args)
	{
		try
		{
	 Employee employee=new Employee();
	 Controller c=new Controller();
	 employee.setEno(101);
	 employee.setEname("om");
	 employee.setSalary(900000);
	 String msg=c.insert(employee);
	 System.out.println(msg);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
