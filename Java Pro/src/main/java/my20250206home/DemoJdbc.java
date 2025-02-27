package my20250206home;

import my20250206class_jdbc.City;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DemoJdbc {
    private static final String GET_ALL = "select * from city";

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
//        String sql = "insert into city values(1, 'Test', 'USA', 'Testing', 500)";
//        String sql = "update city set Name ='Test-2' where Id =1";
//        String sql = "delete from city where id between 4085 and 4089";
//        String sql = "insert into city values(1, 'Test', 'USA', 'Testing', 500)";
        /*boolean i = stmt.execute(sql);
        System.out.println(i);
        ResultSet rs = stmt.executeQuery(sql);*/

//        rs.next(); //ID, Name, CountryCode, District, Population
//        System.out.println(rs.getInt("ID"));
//        System.out.println(rs.getString("Name"));
//        System.out.println(rs.getString("CountryCode"));
//        System.out.println(rs.getString("District"));
//        System.out.println(rs.getString("Population"));
//        System.out.println("Connected to database: " + rs);

        DemoJdbc demoJdbc = new DemoJdbc();
//        demoJdbc.getAll().stream().forEach(System.out::println);
        demoJdbc.getAll();

    }

    public void getAll() throws SQLException {
        try
                (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "338778");
                 Statement stmt = conn.createStatement()) {
            ResultSet resultSet = stmt.executeQuery(GET_ALL);
            List<City> cities = new ArrayList<City>();

            while (resultSet.next()) {
                for (int i = 1; i <= 5; i++) {
                    System.out.print(resultSet.getString(i) + " ");
                }
                System.out.println();
//                City city = fromResult(resultSet);
//                cities.add(city);
            }
//            return cities;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private City fromResult(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("ID");
        String name = resultSet.getString("Name");
        String countryCode = resultSet.getString("CountryCode");
        String district = resultSet.getString("District");
        int population = resultSet.getInt("Population");
        return new City(id, name, countryCode, district, population);
    }
}
