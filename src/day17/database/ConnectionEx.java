package day17.database;

import java.sql.*;

public class ConnectionEx {
  private static Connection connection = null;
  private static String url = "jdbc:mysql://127.0.0.1:3306/ssgdatabase";
  private static String id = "root";
  private static String password = "skadbsgh2!";

  public static void main(String[] args) {
    try {
      //jdbc 드라이버를 connection에 등록
      Class.forName("com.mysql.cj.jdbc.Driver");
      //연결하기
      connection = DriverManager.getConnection(url,id,password);
      System.out.println("connection 객체 값 = " + connection);
    } catch (SQLException e) {
      System.err.println(e.getMessage());
    } catch (ClassNotFoundException e) {
      System.err.println(e.getMessage());
    }finally {
      if(connection != null) {
        //연결 끊기
        try {
          connection.close();
          System.out.println("서버와의 연결이 끊겼습니다.");
        } catch (SQLException e) {
          System.err.println(e.getMessage());
        }
      }
    }
  }
}
