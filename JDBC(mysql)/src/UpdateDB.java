import java.sql.*;
public class UpdateDB 
{
	public static void main(String[] args)
	{
	 try
	 {
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bharat","root","root");
	  String query="update teacher set subject=? where tno=?";
	  PreparedStatement pst=con.prepareStatement(query);	
	  pst.setString(1,"dsa");
	  pst.setInt(2,105);
	  pst.executeUpdate();
	  System.out.println("Record Update Sucessfully...");
	 }catch(Exception e)
	 {
		 System.out.println(e.getMessage());
	 }
	}

}
