package activitytracker;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.time.LocalDateTime;

public class ActivityTrackerMain {

    public static void main(String[] args) {
        MysqlDataSource dataSource;

           dataSource = new MysqlDataSource();
          dataSource.setUrl("jdbc:mysql://localhost:3306/employees?useUnicode=true");
          dataSource.setUser("activitytracker");
          dataSource.setPassword("activitytracker");



     Activity activity = new Activity(LocalDateTime.of(2021,04,15,9,00),"biking in Alpen",ActivityType.BIKING);
     Activity activity2 = new Activity(LocalDateTime.of(2021,04,16,9,00),"hiking in Alpen",ActivityType.BIKING);
     Activity activity3 = new Activity(LocalDateTime.of(2021,04,17,9,00),"running in Alpen",ActivityType.RUNNING);


     ActivityDao activityDao = new ActivityDao(dataSource);

        System.out.println(activityDao.selectById( 4));
        System.out.println(activityDao.selectAllActivities());
        System.out.println(activityDao.selectActivitiesByType(ActivityType.BIKING));
    }
}
