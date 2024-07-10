package day16.jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcEx {
  public static void main(String[] args) {
    memberInsert();
  }

  private static void memberInsert() {
    String url = "jdbc:mysql://localhost:3306/employees";
    String username = "root";
    String password = "skadbsgh2!";
    String query = "INSERT * INTO member VALUES(?,?,?)";

    Connection con = null;
    PreparedStatement pstmt = null;
    //statement vs preparedstatement
    //후자가 더 빠르다.
    int result = 0;

    try{
      //드라이버 로딩 코드(안해도됌)
      //Class.forName("con.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection(url,username,password);

      pstmt = con.prepareStatement(query);
      pstmt.setInt(1,4);
      pstmt.setString(2,"kss");
      pstmt.setString(3,"professor");

      result = pstmt.executeUpdate();

      if(result == 1)
        System.out.println("입력 완료");
      else if(result == 0)
        System.out.println("입력 실패");

      pstmt.close();
      con.close();
    } catch (Exception e){
      throw new RuntimeException(e);
    }
  }

  public static void memberSearch(){
    String url = "jdbc:mysql://localhost:3306/employees";
    String username = "root";
    String password = "skadbsgh2!";
    String query = "SELECT * FROM member";

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    try{
      Class.forName("con.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection(url,username,password);
      System.out.println(con);
      stmt = con.createStatement();
      rs = stmt.executeQuery(query);
      while(rs.next()){
        int id = rs.getInt("id");
        String name = rs.getString("name");
        String job = rs.getString("job");
        System.out.printf("id : %d name : %s job : %s\n",id,name,job);
      }
      rs.close();
      stmt.close();
      con.close();
    } catch (Exception e){
      throw new RuntimeException(e);
    }
  }
}
