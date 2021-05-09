package spring;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.flywaydb.core.Flyway;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class Config {

    public Flyway flyway() {
        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        return flyway;
    }

    @Bean
    public DataSource dataSource() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/employees?useUnicode=true");
        dataSource.setUser("employees");
        dataSource.setPassword("employees");

        return dataSource;
    }

    @Bean
    public EmployeeDao employeeDao() {
        return new EmployeeDao(dataSource());
    }


}
