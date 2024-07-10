package day17.database;

import day17.database.dbconf.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteUserInfo {
  static Connection connection = null;

  public static void main(String[] args) {
    connection = ConnectionFactory.getInstance().open();

    String query = new StringBuilder()
        .append("DELETE FROM ")
        .append("users WHERE userid = ?").toString();

    try {
      PreparedStatement pstmt = connection.prepareStatement(query);
      pstmt.setString(1,"winter");

      int rows = pstmt.executeUpdate();

      pstmt.close();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      ConnectionFactory.getInstance().close();
    }
  }
}
