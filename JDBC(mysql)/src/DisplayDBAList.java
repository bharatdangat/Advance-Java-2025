import java.sql.*;
import java.util.ArrayList;
public class DisplayDBAList
{
 public ArrayList<User> displayDatabase()
 {
	 ArrayList<User> a1=new ArrayList<>();
	 try
	 {
		 Connection con=DBConnection.createDBConnection();
		 String query="select * from user";
		 PreparedStatement pst=con.prepareStatement(query);
		 ResultSet rs=pst.executeQuery();
		 while(rs.next())
		 {
			int userid=rs.getInt(1);
			String username=rs.getString(2);
			String address=rs.getString(3);
			int age=rs.getInt(4);
			//add data inside constructor...
			User user=new User(userid, username, address, age);
			a1.add(user);
		 }
	 }catch(Exception e)
	 {
		 System.out.println(e);
	 }
	 return a1;
 }
}
