//commit()-Save the changes and rollback-retrive the changes.....
import java.sql.*;
import java.util.*;
public class TCL1 
{
	public static void main(String[] args)
	{
	try
	{
	 Connection con=DBConnection.createDBConnection();
	 con.setAutoCommit(false);
	 String query="update employee set salary=? where eno=?";
	 PreparedStatement pst=con.prepareStatement(query);
	 pst.setDouble(1,1000);
	 pst.setInt(2,107);
	 pst.executeUpdate();
	 System.out.println("Update Sucessfully...");
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Are You Sure Update Record-(Yes/NO)-");
	 String ch=sc.next();
	 if(ch.equals("Yes"))
	 {
		 con.commit();
	 }
	 else
	 {
		 con.rollback();
		 System.out.println("Try Again....");
	 }
	}catch(Exception e)
	{
	 System.out.println(e);	
	}
	}

}
