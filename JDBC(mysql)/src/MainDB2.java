import java.util.*;
public class MainDB2
{
	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	 InsertDBAList ob=new InsertDBAList();
	 User user=new User();
	 System.out.println("Enter User Id-");
	 int userid=sc.nextInt();
	 System.out.println("Enter User Name-");
	 String username=sc.next();
	 System.out.println("Enter User Address-");
	 String address=sc.next();
	 System.out.println("Enter User Age-");
	 int age=sc.nextInt();
	 
	 user.setUserid(userid);
	 user.setUsername(username);
	 user.setAddress(address);
	 user.setAge(age);
	 String msg=ob.insertDatabase(user);
	 System.out.println(msg);
	}

}
