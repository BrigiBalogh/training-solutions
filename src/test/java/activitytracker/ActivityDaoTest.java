package activitytracker;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ActivityDaoTest {

    ActivityDao activityDao;

    @BeforeEach
    public void init() throws SQLException {
        MysqlDataSource dataSource;

        dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/activitytracker?useUnicode=true");
        dataSource.setUser("activitytracker");
        dataSource.setPassword("activitytracker");

        Flyway flyway = Flyway.configure()
                .locations("/db/migration/activitytracker")
                .dataSource(dataSource)
                .load();
        flyway.clean();
        flyway.migrate();

        activityDao = new ActivityDao(dataSource);
    }

    @Test
    void insertActivityTest() {
        Activity activity = new Activity(LocalDateTime.of(2021,04,15,9,00),"biking in Alpen",ActivityType.BIKING);
        activityDao.insertActivity(activity);

        assertEquals(activityDao.selectAllActivities().size(),4);
    }

    @Test
    void selectById() {

        Activity activity = activityDao.selectById(1L);
        assertEquals(ActivityType.BIKING, activity.getType());
    }

    @Test
    void selectAllActivities() {
    }

    @Test
    void selectActivitiesByTypeTest() {
        assertEquals(activityDao.selectActivitiesByType(ActivityType.HIKING).size(),1);
    }

    @Test
    void beforeDateTest() {
        assertEquals(2, activityDao.activitiesBeforeDate(LocalDate.of
                (2021, 02, 12)).size());

        System.out.println(activityDao.createStatementForMoreInsert(5));
    }
    @Test
    void findByIdTest() {
        Activity activity = new Activity(LocalDateTime.now(),"Biking in Mecsek", ActivityType.BIKING);
        Activity result = activityDao.insertActivity(activity);

        assertEquals(activity.getDesc(), activityDao.selectById(result.getId()).getDesc());
    }
}