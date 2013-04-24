import java.sql.*;

public class InsertValues{
  public static void main(String[] args) {
    System.out.println("Inserting values in Mysql database table!");
    Connection con = null;
    String url = "jdbc:mysql://localhost:3306/";
    String db = "jdbctutorial";
    String driver = "com.mysql.jdbc.Driver";
    try{
      Class.forName(driver);
      con = DriverManager.getConnection(url+db,"root","root");
      try{
        Statement st = con.createStatement();
        int val = st.executeUpdate("INSERT employee VALUES("+13+","+"'Aman'"+")");
        System.out.println("1 row affected");
      }
      catch (SQLException s){
        System.out.println("SQL statement is not executed!");
      }
    }
    catch (Exception e){
      e.printStackTrace();
    }
  }
} 