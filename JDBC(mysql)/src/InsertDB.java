import java.sql.*;
public class InsertDB
{
	public static void main(String[] args)
	{
	try
	{
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bharat","root","root");
	 String query="insert into user values(?,?,?,?)";
	 PreparedStatement pst=con.prepareStatement(query);
	 pst.setInt(1,101);
	 pst.setString(2,"mr.om");
	 pst.setString(3,"sambhajinagar");
	 pst.setInt(4,30);
	 pst.executeUpdate();
	 System.out.println("Record Insert Sucessfullly...");
	}catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	}

}
