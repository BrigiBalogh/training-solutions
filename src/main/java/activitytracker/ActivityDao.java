package activitytracker;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityDao {

    private DataSource dataSource;

    public ActivityDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    public Activity insertActivity( Activity activity) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(
                     "insert into activities(start_time,activity_desc,activity_type) values (?,?,?)",
                     Statement.RETURN_GENERATED_KEYS)) {
            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2, activity.getDesc());
            stmt.setString(3, activity.getType().toString());
            stmt.executeUpdate();
            return getIdFromStatement(activity, stmt);
        }
        catch (SQLException se) {
            throw new IllegalStateException("Can not insert", se);
        }
    }

    private Activity getIdFromStatement(Activity activity, PreparedStatement stmt) throws SQLException {
        try(ResultSet rs = stmt.getGeneratedKeys()) {
            if(rs.next()) {
                long id = rs.getLong(1);
                return new Activity(id, activity.getStartTime(), activity.getDesc(), activity.getType());
            }
        }
        throw new IllegalStateException("Cannot get key !");
    }

    public String createStatementForMoreInsert(int numberOfElements) {
        StringBuilder sb = new StringBuilder("insert into activities(start_time,activity_desc,activity_type) values ");
        for (int i = 0; i < numberOfElements; i++) {
            sb.append("(?,?,?)");
        }
        return sb.toString();
    }

    public Activity selectById( long id) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt =
                     conn.prepareStatement("select * from activities where id = ?");
        ) {
            stmt.setLong(1, id);
            List<Activity> result = selectByPreparedStatement(stmt);
            if (result.size() == 1) {
                return result.get(0);
            }
            throw new IllegalArgumentException("The data is wrong");
        } catch (SQLException sqle) {
            throw new IllegalArgumentException("Error by insert", sqle);
        }
    }

    private List<Activity> selectByPreparedStatement(PreparedStatement stmt) {
        List<Activity>result = new ArrayList<>();
        try (ResultSet rs = stmt.executeQuery();
        ) {
            while (rs.next()) {
                Activity activity = new Activity(rs.getLong("id"), rs.getTimestamp("start_time").toLocalDateTime(),
                        rs.getString("activity_desc"),ActivityType.valueOf(rs.getString("activity_type")));
                result.add(activity);
            }
            return result;
        } catch (SQLException sqle) {
            throw new IllegalArgumentException("Error by insert", sqle);
        }
    }

    public List<Activity> selectAllActivities() {

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from activities")){

            return selectByPreparedStatement(stmt);
        }
        catch (SQLException se) {
            throw new IllegalStateException("Cannot select employees", se);
        }
    }

    public List<Activity> selectActivitiesByType(ActivityType type){
        try(Connection conn = dataSource.getConnection();
        PreparedStatement stmt = conn.prepareStatement("select * from activities where  activity_type = ?")
        ){
            stmt.setString(1,type.toString());
            return selectByPreparedStatement(stmt);

        }catch (SQLException se) {
            throw new IllegalStateException("Cannot query", se);
        }

    }

    public List<Activity> activitiesBeforeDate(LocalDate date) {
        List<Activity> result = new ArrayList<>();
        try(Connection conn = dataSource.getConnection();
        PreparedStatement stmt = conn.prepareStatement("select * from activities where start_time < ?")){
           // stmt.setTimestamp(1, Timestamp.valueOf("startTime")); LocalDateTime -mal
            LocalDateTime actualDate = date.atTime(0,0);//23 59 ha az az napiakat is akarom.
            stmt.setTimestamp(1, Timestamp.valueOf(actualDate));
            return selectByPreparedStatement(stmt);
        }catch (SQLException se) {
            throw new IllegalStateException("Cannot connect !", se);
        }

    }

}
