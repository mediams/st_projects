package my20250206class_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBConnector {

    public Connection getConnection() throws SQLException {
        ResourceBundle rb = ResourceBundle.getBundle("db");

        String driver = rb.getString("driver");
        String url = rb.getString("url");
        String user = rb.getString("user");
        String pass = rb.getString("pass");
        String dbName = rb.getString("dbName");

        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Ошибка загрузки драйвера: " + driver, e);
        }

        return DriverManager.getConnection(url, user, pass);
    }
}
