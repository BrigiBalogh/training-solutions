package spring;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import javax.sql.DataSource;
import java.sql.*;
import java.util.List;

public class EmployeeDao {

    private JdbcTemplate jdbcTemplate;

    public EmployeeDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public long createEmployee2(String name) {
        KeyHolder holder = new GeneratedKeyHolder();
        jdbcTemplate.update(conn -> {
            PreparedStatement ps = conn.prepareStatement("Insert into employees(emp_name) values(?)," +
                    Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, name);
            return ps;
        }, holder);
        return holder.getKey().longValue();
    }

    public void  createEmployee(String name) {
        jdbcTemplate.update("Insert into employees(emp_name) values(?)", name);
    }

    public List<String> listEmployeeNames() {
        return jdbcTemplate.query("select emp_name from employees order by emp_name", (rs, i) -> rs.getString("emp_name"));
    }

    public String findEmployeeNameById(long id) {
        return jdbcTemplate.queryForObject("select emp_name from employees where id = ?",
                new Object[]{id}, (rs, rowNum) -> rs.getString("emp_name"));
    }
}
