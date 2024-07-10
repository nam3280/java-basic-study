package day16.Homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Member extends MemberDB{
  private final String url = "jdbc:mysql://localhost:3306/employees";
  private String userName;
  private String password;

  public Member(){}

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getUrl() {
    return url;
  }

  public String getUserName() {
    return userName;
  }

  public String getPassword() {
    return password;
  }

  void memberSearch(Member member){
    String query = "SELECT * FROM member";

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
      con = DriverManager.getConnection(member.getUrl(), member.getUserName(), member.getPassword());
      System.out.println(con);
      stmt = con.createStatement();
      rs = stmt.executeQuery(query);
      while (rs.next()) {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        String job = rs.getString("job");
        System.out.printf("id : %d name : %s  job : %s\n", id, name, job);
      }
      rs.close();
      stmt.close();
      con.close();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}
