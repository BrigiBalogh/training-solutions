package activity;

import java.util.ArrayList;
import java.util.List;

public class Track {

    List<TrackPoint> trackPoints = new ArrayList<>();

    public void addTrackPoint(TrackPoint trackPoint ) {
        trackPoints.add(trackPoint);

    }

    public Coordinate findMaximumCoordinate() {
       Coordinate max = null;
        for ( TrackPoint trackPoint : trackPoints) {
            if ( trackPoint > max) {
                max = trackPoint;

            }
        }
        return max;
    }

    public Coordinate findMinimumCoordinate() {
        Coordinate min = null;
        for (Coordinate coordinate :  {
            if (trackPoint < min) {
                min = ;
            }
        }
        return min;
    }

    public double getDistance() {

    }

    public double getFullDecrease() {

    }

    public double getFullElevation() {

    }

    public double getRectangleArea() {

    }

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }
}
