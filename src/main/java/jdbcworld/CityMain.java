package jdbcworld;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CityMain {

    public static void main(String[] args) {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/world?useUnicode=true");
        dataSource.setUser("employees");
        dataSource.setPassword("employees");

        try (
                Connection conn = dataSource.getConnection()) {
            CityDao cityDao = new CityDao(conn);
            List<City> cities = cityDao.selectAllCities();
            System.out.println(cities);
        }catch (SQLException se) {
            throw new IllegalStateException("Database error ", se);
        }

    }

}
