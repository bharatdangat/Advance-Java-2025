import java.sql.*;
public class CreateDB
{
	public static void main(String[] args)
	{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bharat","root","root");
		Statement st=con.createStatement();
		String query="create table user(userid int primary key,username char(20),address char(20),age int)";
		st.execute(query);
		System.out.println("Table create Sucessfully....");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
