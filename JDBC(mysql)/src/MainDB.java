import java.util.*;

public class MainDB
{
	public static void main(String[] args)
	{ 	 
     DisplayDBAList db=new DisplayDBAList();
	 ArrayList<User> a=db.displayDatabase();
	 for(User u:a)
	 {
		 System.out.println("User Id-"+u.getUserid());
		 System.out.println("User Name-"+u.getUsername());
		 System.out.println("User Address-"+u.getAddress());
		 System.out.println("User Age-"+u.getAge());
	     System.out.println("- - - - - - - - - - - - - - - - - - -- -");
	 }
	}

}
