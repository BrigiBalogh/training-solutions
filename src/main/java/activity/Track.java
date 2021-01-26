package activity;

import java.util.ArrayList;
import java.util.List;

public class Track {

    List<TrackPoint> trackPoints = new ArrayList<>();

    public void addTrackPoint(TrackPoint trackPoint ) {
        trackPoints.add(trackPoint);

    }

    public Coordinate findMaximumCoordinate() {
       double maxLat = trackPoints.get(0).getCoordinate().getLatitude();
       double maxLon = trackPoints.get(0).getCoordinate().getLongitude();
        for ( TrackPoint trackPoint : trackPoints) {
            if ( trackPoint.getCoordinate().getLatitude() > maxLat) {
                maxLat = trackPoint.getCoordinate().getLatitude();

            }
            if ( trackPoint.getCoordinate().getLongitude() > maxLon) {
                maxLon = trackPoint.getCoordinate().getLongitude();
        }
        return new Coordinate(maxLat, maxLon) ;
    }

    public Coordinate findMinimumCoordinate() {
            double minLat = trackPoints.get(0).getCoordinate().getLatitude();
            double minLon = trackPoints.get(0).getCoordinate().getLongitude();
            for ( TrackPoint trackPoint : trackPoints) {
                if ( trackPoint.getCoordinate().getLatitude() < minLat) {
                    minLat = trackPoint.getCoordinate().getLatitude();

                }
                if ( trackPoint.getCoordinate().getLongitude() < minLon) {
                    minLon = trackPoint.getCoordinate().getLongitude();
                }
                return new Coordinate(minLat, minLon) ;
            }
    }

    public double getDistance() {
            double distanceSum = 0;
            TrackPoint prev = trackPoints.get(0);
            for (TrackPoint trackPoint : trackPoints) {
                distanceSum += prev.getDistanceFrom(trackPoint);
                prev = trackPoint;
            }
            return distanceSum;
    }11

    public double getFullDecrease() {
        double decreaseSum = 0;
        TrackPoint prev = trackPoints.get(0);
        for (TrackPoint trackPoint : trackPoints) {
            if (trackPoint.lowerThan(prev)) {
                decreaseSum += prev.elevationDifference(trackPoint);
            }
        }
        return decreaseSum;



    }

    public double getFullElevation() {
        double elevationSum = 0;
        TrackPoint prev = trackPoints.get(0);
        for (TrackPoint trackPoint : trackPoints) {

            if (trackPoint.higherThan(prev)) {
                elevationSum += trackPoint.elevationDifference(prev);
            }
        }
        return elevationSum;
    }

    public double getRectangleArea() {
            Coordinate min = findMinimumCoordinate();
            Coordinate max = findMaximumCoordinate();

            return max.getLatitude() - min.getLatitude() *
                    max.getLongitude() -min.getLongitude();
    }

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }
}
