import java.sql.*;
import java.io.*;
public class Ex
{
public static void main(String ag[])
{
Connection con;
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con = DriverManager.getConnection("jdbc:odbc:A");
Statement st = con.createStatement();
st.executeUpdate ("CREATE TABLE COFEE1" + "(COF_Name VARCHAR(32),SUB_ID INTEGER,PRICE FLOAT,SALES INTEGER,TOTAL INTEGER)");
}

catch(ClassNotFoundException e)

{
System.out.println(e.toString());

}

catch(SQLException e)
{
System.out.println(e.toString());
}
}

}