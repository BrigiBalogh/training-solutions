package sakila;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Sakila {

    private final DataSource dataSource;

    public Sakila(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> actorsSearcher() {
        try (
                Connection conn = dataSource.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT last_name FROM actor WHERE first_name = 'PENELOPE'")
        ) {
            List<String> names = new ArrayList<>();
            while (rs.next()) {
                String name = rs.getString("last_name");
                names.add(name);
            }
            return names;
        }
        catch (SQLException se) {
            throw new IllegalStateException("Cannot select employees", se);
        }
    }
}