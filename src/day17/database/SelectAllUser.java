package day17.database;

import day17.database.dbconf.ConnectionFactory;
import day17.database.vo.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SelectAllUser {
  static Connection connection = null;
  static ResultSet rs = null;
  static ArrayList<User> userList= new ArrayList<User>();

  public static void main(String[] args) {
    String query = "SELECT * FROM users";

    connection = ConnectionFactory.getInstance().open();

    try {
      PreparedStatement pstmt = connection.prepareStatement(query);
      rs = pstmt.executeQuery();
      while(rs.next()) {
        User user = new User();

        user.setUserid(rs.getString("userid"));
        user.setUsername(rs.getString("username"));
        user.setUseremail(rs.getString("useremail"));
        user.setUserage(rs.getInt("userage"));

        userList.add(user);
      }
      for (User user : userList)
        System.out.println(user.getUserid());

      rs.close();
      pstmt.close();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }finally {
      ConnectionFactory.getInstance().close();
    }
  }
}
