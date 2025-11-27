import java.sql.*;
public class DBConnection
{
  private static final String url="jdbc:mysql://localhost:3306/bharat";
  private static final String username="root";
  private static final String password="root";
  
  //method will be static becoz no need to create object...
  public static Connection createDBConnection()
  {
	  Connection con=null;
	  try
	  {
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  con=DriverManager.getConnection(url, username, password);
	  }catch(Exception e)
	  {
		  System.out.println(e.getMessage());
	  }
	  return con;
  }
}
