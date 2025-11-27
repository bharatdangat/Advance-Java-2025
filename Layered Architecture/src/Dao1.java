import java.sql.*;
import java.util.ArrayList;
class Dao1 //dtatabase ka code...
{
	ArrayList<Cricketers> databaseCode()
	{
		ArrayList<Cricketers> a1=new ArrayList<>();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
	     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bharat","root","root");
	     	Statement st=con.createStatement();
	     	ResultSet rs=st.executeQuery("Select * from cricketer");
	     	while(rs.next())
	     	{
	     		int  jno=rs.getInt(1);
	     		String nm=rs.getString(2);
	     		Cricketers c1=new Cricketers(nm,jno);
		     	a1.add(c1);
		     	
	     	}
	     	
	     	
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return a1;
	}
}