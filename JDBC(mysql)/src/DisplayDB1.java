import java.sql.*;
public class DisplayDB1
{
	public static void main(String[] args)
	{
	try
	{
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bharat","root","root");
	 String query="select * from teacher";
	 PreparedStatement pst=con.prepareStatement(query);
	 ResultSet rs=pst.executeQuery();
	 while(rs.next())
	 {
		 System.out.println("Teacher No-"+rs.getInt(1));
		 System.out.println("Teacher Name-"+rs.getString(2));
		 System.out.println("Teacher Subject-"+rs.getString(3));
		 System.out.println("------------------------");
	 }
	}catch(Exception e)
	{
		System.out.println(e);
	}
	}

}
