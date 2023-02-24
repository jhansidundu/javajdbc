import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.mysqljdbcdemo.MySQLJDBCUtil;

public class App {
    public static void main(String[] args) throws Exception {
        Connection conn = MySQLJDBCUtil.mysql();
        if (conn != null) {
            conn.close();
            System.out.println("Connection Closed");
        }

    }
}
