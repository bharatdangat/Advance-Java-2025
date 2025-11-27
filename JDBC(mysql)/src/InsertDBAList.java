import java.sql.*;
public class InsertDBAList
{
   public String insertDatabase(User user)
   {
	   try
	   {
	   Connection con=DBConnection.createDBConnection();
	   String query="insert into user values(?,?,?,?)";
	   PreparedStatement pst=con.prepareStatement(query);
	   pst.setInt(1,user.getUserid());
	   pst.setString(2,user.getUsername());
	   pst.setString(3,user.getAddress());
	   pst.setInt(4,user.getAge());
	   
	   pst.executeUpdate();
	   }catch(Exception e)
	   {
		   System.out.println(e);
	   }
	   return "Insert Record Sucessfully....";
   }
}
