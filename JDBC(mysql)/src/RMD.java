import java.sql.*;
public class RMD 
{
	public static void main(String[] args)
	{
      try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bharat","root","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from employee");
		ResultSetMetaData rmd=rs.getMetaData();
		System.out.println("Table Name-"+rmd.getTableName(1));
		System.out.println("Column Count-"+rmd.getColumnCount());
		System.out.println("Column Name-"+rmd.getColumnName(2));
		System.out.println(" Column Size"+rmd.getColumnDisplaySize(3));
		System.out.println("Class Name-"+rmd.getClass());
		
		
		
		
      } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
    }
}
