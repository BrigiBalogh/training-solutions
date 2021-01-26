package activity;

import java.util.ArrayList;
import java.util.List;

public class Activities {


    private List<Activity> activities ;

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public List<Report> distancesByTypes() {
        double[] sum = new double[ActivityType.values().length];
        for (Activity activity : activities) {
            sum[activity.getType().ordinal()] += activity.getDistance();
        }

        List<Report> result = new ArrayList<>();
        for (ActivityType activityType : ActivityType.values()) {
            result.add(new Report(activityType,sum[activityType.ordinal()]));
        }
        return result;
    }

    public int numberOfTrackActivities() {

        int trackActivities = 0;
        for ( Activity activity : activities) {
            if (activity.getType().hasTrack()) {
                trackActivities++;
            }
        }
        return trackActivities;
    }

    public int numberOfWithoutTrackActivities() {
        int withoutTrackActivities = 0;
        for ( Activity activity : activities) {
            if (!activity.getType().hasTrack()) {
                withoutTrackActivities++;
            }
        }
        return withoutTrackActivities;
    }
}
