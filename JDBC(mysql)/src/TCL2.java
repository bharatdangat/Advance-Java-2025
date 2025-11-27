import java.sql.*;
public class TCL2 
{
	public static void main(String[] args)throws Exception
	{
	 Connection con=DBConnection.createDBConnection();
	 con.setAutoCommit(false);
	 String query="update employee set salary=? where eno=?";
	 PreparedStatement pst=con.prepareStatement(query);
	 pst.setDouble(1,4000);
	 pst.setInt(2,101);
	 pst.executeUpdate();
	 pst.setDouble(1,5000);
	 pst.setInt(2,102);
	 pst.executeUpdate();
	 Savepoint s1=con.setSavepoint();
	 pst.setDouble(1,4000);
	 pst.setInt(2,107);
	 pst.executeUpdate();
	 Statement st=con.createStatement();
	 ResultSet rs=st.executeQuery("select * from employee");  
	 while(rs.next())
	  {
		int no=rs.getInt(1);
		Float sal=rs.getFloat(3);
		System.out.println(no+"="+sal);
		if(sal<3000)
		{
			con.rollback(s1);
		}
	 System.out.println("Update Sucesssfully...");
	 con.commit();
	}

	}
}
