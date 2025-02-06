package my20250206home;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DemoJdbc {
    public static void main(String[] args) throws SQLException {

        /*
        * import package
        * load and register
        * create connection
        * create statement
        * execute statement
        * process the result
        * close
        * */

        String url = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String password = "338778";

        Connection conn = DriverManager.getConnection("","","");

    }
}
