package my20250206home;

import java.sql.*;

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

        String url = "jdbc:mysql://localhost:3306/world";
        String user = "root";
        String password = "338778";

        Connection conn = DriverManager.getConnection(url, user, password);
        Statement stmt = conn.createStatement();
//        String sql = "select * from city where id = 2";
//        String sql = "insert into city values(1, 'Test', 'USA', 'Testing', 500)";
//        String sql = "update city set Name ='Test-2' where Id =1";
//        String sql = "delete from city where id=1";
        String sql = "insert into city values(1, 'Test', 'USA', 'Testing', 500)";
        boolean i = stmt.execute(sql);
        System.out.println(i);
//        ResultSet rs = stmt.executeQuery(sql);

//        rs.next(); //ID, Name, CountryCode, District, Population
//        System.out.println(rs.getInt("ID"));
//        System.out.println(rs.getString("Name"));
//        System.out.println(rs.getString("CountryCode"));
//        System.out.println(rs.getString("District"));
//        System.out.println(rs.getString("Population"));
//        System.out.println("Connected to database: " + rs);

//        while (rs.next()) {
//            System.out.print(rs.getInt(1) + " - ");
//            System.out.print(rs.getString(2) + " - ");
//            System.out.print(rs.getString(3)+ " - ");
//            System.out.print(rs.getString(4)+ " - ");
//            System.out.println(rs.getString(5));
//        }
//
//        rs.close();
    }
}
