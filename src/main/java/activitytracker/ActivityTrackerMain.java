package activitytracker;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.flywaydb.core.Flyway;

import java.sql.SQLException;
import java.time.LocalDateTime;

public class ActivityTrackerMain {

    public static void main(String[] args) {
        MysqlDataSource dataSource;


            dataSource = new MysqlDataSource();
            dataSource.setUrl("jdbc:mysql://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");




     Activity activity = new Activity(LocalDateTime.of(2021,04,15,9,00),"biking in Alpen",ActivityType.BIKING);
     Activity activity2 = new Activity(LocalDateTime.of(2021,04,16,9,00),"hiking in Alpen",ActivityType.BIKING);
     Activity activity3 = new Activity(LocalDateTime.of(2021,04,17,9,00),"running in Alpen",ActivityType.RUNNING);

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

     ActivityDao activityDao = new ActivityDao(dataSource);


    }
}
