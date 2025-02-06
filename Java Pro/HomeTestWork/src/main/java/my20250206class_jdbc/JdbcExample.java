package my20250206class_jdbc;

import java.sql.*;

public class JdbcExample {
    public static void main(String[] args) throws SQLException {
        try
                (
                        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "338778");
                        PreparedStatement preparedStatement = conn.prepareStatement("select * from city");
                ) {

            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            String name1 = resultSet.getString(1);
            String name2 = resultSet.getString(2);
            String name3 = resultSet.getString(3);
            String name4 = resultSet.getString(4);
            String name5 = resultSet.getString(5);
            System.out.println(name1 + " " + name2 + " " + name3 + " " + name4 + " " + name5);

            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    if (i == 1) {
                        System.out.print(resultSet.getString(i) + "\t");
                    } else if (resultSet.getString(i).length() < 8) {
                        System.out.print(resultSet.getString(i) + "\t\t\t");


                    }
                    else if (resultSet.getString(i).length() > 15) {
                        System.out.print(resultSet.getString(i) + "");

                    }else if (resultSet.getString(i).length() > 13) {
                        System.out.print(resultSet.getString(i) + "\t");

                    } else if (resultSet.getString(i).length() > 14) {
                        System.out.print(resultSet.getString(i) + " ");

                    }else System.out.print(resultSet.getString(i) + "\t\t");
                }
                System.out.println();

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
