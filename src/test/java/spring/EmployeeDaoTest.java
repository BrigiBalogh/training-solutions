package spring;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.io.ObjectInputFilter;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = Config.class)
class EmployeeDaoTest {

    @Autowired
    Flyway flyway;

    @Autowired
    private EmployeeDao employeeDao;

   @BeforeEach
   void init() {
       flyway.clean();
       flyway.migrate();
   }

    @Test
    void testCreateThanList() {
        employeeDao.createEmployee("John Doe");
        List<String> employees = employeeDao.listEmployeeNames();

        assertEquals(Arrays.asList("John Doe"),employees);
    }

    @Test
    void testThanFind() {
       long id = employeeDao.createEmployee2("John Doe");
        System.out.println(id);
        String name = employeeDao.findEmployeeNameById(id);
        assertEquals("John Doe", name);
    }
}