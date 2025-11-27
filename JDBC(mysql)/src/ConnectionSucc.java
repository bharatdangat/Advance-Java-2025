import java.sql.*;
public class ConnectionSucc 
{
	public static void main(String[] args)
	{
	 Connection con=DBConnection.createDBConnection();
	 System.out.println("Connection Sucessfully.....");
	}

}
