/* 133 WAP in java to demonstrate data entry program. */
import java.sql.*;
class DataEntry
{
	public static void main(String args[])throws SQLException,Exception
	{
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		PreparedStatement ps=con.prepareStatement("insert into login values(?,?,?)");
		ps.setString(1,args[0]);
		ps.setString(2,args[1]);
		ps.setString(3,args[2]);
		int i=ps.executeUpdate();
		if(i>0)
			System.out.println("Data Inserted.....");
		else
			System.out.println("Data not Inserted.....");
		ps.close();
		con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		
		}
	
	
	}


}