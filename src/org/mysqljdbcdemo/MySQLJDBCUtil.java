package org.mysqljdbcdemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class MySQLJDBCUtil {

  public static Connection mysql() {
    Connection conn = null;

    try {
      FileInputStream f = new FileInputStream("db.properties");
      Properties pro = new Properties();
      pro.load(f);
      String url = pro.getProperty("url");
      String user = pro.getProperty("user");
      String password = pro.getProperty("password");
      // Connection conn = null;
      conn = DriverManager.getConnection(url, user, password);

    } catch (Exception e) {
      System.out.println(e.getMessage());
      System.out.print("hey you got error in connection");

    } finally {
      System.out.println("finally block executed");
    }
    return conn;
  }
}
