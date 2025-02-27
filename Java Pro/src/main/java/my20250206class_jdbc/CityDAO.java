package my20250206class_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CityDAO implements WorldDAO<City, Integer> {

    private final DBConnector con;
    private static final String GET_ALL = "select * from city";


    public CityDAO(DBConnector con) {
        this.con = con;
    }


    public List<City> findAll() {
        List<City> cities = new ArrayList<>();
        try
                (Connection connection = con.getConnection();
                 Statement stmt = con.getConnection().createStatement()) {
            ResultSet rs = stmt.executeQuery(GET_ALL);
            while (rs.next()) {
                City city = getCityFromResult(rs);
                cities.add(city);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cities;
    }

    private City getCityFromResult(ResultSet rs) throws SQLException {
        int id = rs.getInt(1);
        String string = rs.getString("Name");
        String country = rs.getString("CountryCode");
        String district = rs.getString("District");
        int population = rs.getInt("Population");
        return new City(id, string, country, district, population);

    }

    @Override
    public List getAll() {
        return List.of();
    }

    @Override
    public Optional<City> getById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public void add(City data) {

    }

    @Override
    public void update(City data) {

    }

    @Override
    public void delete(City data) {


    }
}
