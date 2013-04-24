/* 126 WAP to display specific student record based on rollnumber. If not found than display all records in tabular form. */
import java.sql.*;
class SearchStudents
{
	public static void main(String args[])
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			Statement St=con.createStatement();
			ResultSet RS=St.executeQuery("select * from students order by rno");  			// resultset is a some virtual table
			System.out.print("rno\t");
			System.out.print("name\t");
			System.out.print("phy\t\t");
			System.out.print("chem\t\t");
			System.out.println("math\t\t");
			while(RS.next())
			{
				System.out.print(RS.getInt(1)+"\t");						// getInt() ,getFloat() , getType() , getChar() and so on
				System.out.print(RS.getString("name")+"\t");
				System.out.print(RS.getInt(3)+"\t\t");
				System.out.print(RS.getInt("chem")+"\t\t");
				System.out.println(RS.getInt(5)+"\t\t");
			}
			RS.close();
			St.close();
			con.close();
			}
			catch(Exception e)
			{
				System.out.println("Error found..."+e);
			}
		
		
		
	}
	
	
	
}

