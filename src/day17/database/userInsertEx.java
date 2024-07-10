package day17.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class userInsertEx {
  public static void main(String[] args) {
    Connection connection = null;
    String url = "jdbc:mysql://127.0.0.1:3306/ssgdatabase";
    String id = "root";
    String pwd = "skadbsgh2!";
    String query = "INSERT INTO users(userid,username,useremail,userage)" + "VALUES(?,?,?,?)";
    try {
      connection = DriverManager.getConnection(url,id,pwd);
      //PreparedStatement 객체 생성하여 쿼리문 넣기
      PreparedStatement pstmt = connection.prepareStatement(query);
      //PreparedStatement 객체 파라미터에 순서와 타입 확인하여 데이터 할당
      pstmt.setString(1,"winter");
      pstmt.setString(2,"name");
      pstmt.setString(3,"winter0@gmail.com");
      pstmt.setInt(4,10);
      //sql문 실행
      int rows = pstmt.executeUpdate();
      System.out.println("저장된 행의 수 : " + rows);
      pstmt.close();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      if(connection != null) {
        try {
          connection.close();
        } catch (SQLException e) {
          throw new RuntimeException(e);
        }
      }
    }
  }
}
