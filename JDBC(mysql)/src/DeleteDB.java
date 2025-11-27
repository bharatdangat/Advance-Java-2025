import java.sql.*;
public class DeleteDB
{
	public static void main(String[] args)
	{
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bharat","root","root");
		String query="delete from teacher where tno=105";
		Statement st=con.createStatement();
		st.executeUpdate(query);
		System.out.println("Record Delete Succ..");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	};
	}

}
