package day16.jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcEx1 {
  public static void main(String[] args) {
    mysqlConnection();
  }

  public static void mysqlConnection(){
    String url = "jdbc:mysql://localhost:3306/employees";
    String username = "root";
    String password = "skadbsgh2!";
    String query = "SELECT * FROM student";

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    try{
      con = DriverManager.getConnection(url, username, password);
      System.out.println(con);
      stmt = con.createStatement();
      rs = stmt.executeQuery(query);
      while(rs.next()){
        String sno = rs.getString("sno");
        String name = rs.getString("name");
        int korean = rs.getInt("korean");
        int english = rs.getInt("english");
        int math = rs.getInt("math");
        int science = rs.getInt("science");
        int total = rs.getInt("total");
        float average = rs.getFloat("average");
        String grade = rs.getString("grade");
        System.out.printf(
            "sno = %s name = %s korean = %d english = %d math = %d "
                + "science = %d total = %d average = %.1f grade = %s\n"
            , sno, name, korean, english, math, science, total, average, grade);
      }
      rs.close();
      stmt.close();
      con.close();
    } catch (Exception e){
      throw new RuntimeException(e);
    }
  }
}
