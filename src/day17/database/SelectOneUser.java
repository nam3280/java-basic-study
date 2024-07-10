package day17.database;

import day17.database.vo.User;
import day17.database.dbconf.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectOneUser {
  static Connection connection = null;
  static ResultSet rs = null;
  public static void main(String[] args) {
    String query = "SELECT userid,username,userage,useremail " +
                    "FROM users WHERE userid = ?";

    connection = ConnectionFactory.getInstance().open();

    try {
      PreparedStatement pstmt = connection.prepareStatement(query);
      pstmt.setString(1,"winter");
      rs = pstmt.executeQuery();
      if (rs.next()) {
        User user = new User();

        user.setUserid(rs.getString("userid"));
        user.setUsername(rs.getString("username"));
        user.setUseremail(rs.getString("useremail"));
        user.setUserage(rs.getInt("userage"));

        System.out.println(user.toString());
      } else {
        System.out.println("회원 존재 x");
      }
      rs.close();
      pstmt.close();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }finally {
        ConnectionFactory.getInstance().close();
    }
  }
}
