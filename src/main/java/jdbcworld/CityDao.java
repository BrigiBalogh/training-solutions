package jdbcworld;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CityDao {

    private Connection conn;
    private PreparedStatement selectAll;

    public CityDao(Connection conn) throws SQLException {
        this.conn = conn;
        this.selectAll = conn.prepareStatement("select * from city");
    }

    public List<City> selectAllCities() throws SQLException {
        List<City> result = new ArrayList<>();
        ResultSet rs = selectAll.executeQuery();
        while (rs.next()) {
            City city = makeOne(rs);
            result.add(city);
        }
        return result;
    }

    private City makeOne(ResultSet rs ) throws SQLException {

        long id = rs.getLong("id");
        String name = rs.getString("name");
        String countryCode = rs.getString("countryCode");
        String district = rs.getString("district");
        int population = rs.getInt("population");
        City city = new City(id,name,countryCode,district,population);
        return city;




    }


}
