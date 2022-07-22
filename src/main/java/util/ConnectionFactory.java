package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    public Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@semifinal_medium?TNS_ADMIN=/Users/jyp/Desktop/Clound_Info/Wallet_SemiFinal/";
            String user = "admin";
            String password = "Wnsdud2260341008";
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
