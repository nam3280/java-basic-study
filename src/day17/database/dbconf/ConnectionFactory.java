package day17.database.dbconf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
  private Connection connection = null;
  private String url = "jdbc:mysql://localhost:3306/ssgdatabase";
  private String id = "root";
  private String pwd = "skadbsgh2!";

  private static final ConnectionFactory instance = new ConnectionFactory();

  private ConnectionFactory(){}

  public static ConnectionFactory getInstance(){
    return instance;
  }

  public Connection open() {
    try {
      connection = DriverManager.getConnection(url,id,pwd);
    }  catch (SQLException e) {
      System.err.println(e.getMessage());
    }
    return connection;
  }

  public void close() {
    try {
      connection.close();
    } catch (SQLException e) {
      System.err.println(e.getMessage());
    }
  }
}
