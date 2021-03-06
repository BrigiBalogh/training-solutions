package activity;

public class TrackPoint {


    private Coordinate coordinate;
    private double elevation;

    public TrackPoint(Coordinate coordinate, double elevation) {
        this.coordinate = coordinate;
        this.elevation = elevation;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public double getElevation() {
        return elevation;
    }

    public double getDistanceFrom(TrackPoint trackPoint) {
        final int radiusOfEarth = 6371;

        final double thisLatitude = coordinate.getLatitude();
        final double thisLongitude = coordinate.getLongitude();
        final double otherLatitude = trackPoint.getCoordinate().getLatitude();
        final double otherLongitude = trackPoint.getCoordinate().getLongitude();

        double latitudeDistance = Math.toRadians(otherLatitude-thisLatitude);
        double longitudeDistance = Math.toRadians(otherLongitude-thisLongitude);
        double a = Math.sin(latitudeDistance / 2) * Math.sin(latitudeDistance / 2)
                + Math.cos(Math.toRadians(thisLatitude)) * Math.cos(Math.toRadians(otherLatitude))
                * Math.sin(longitudeDistance/ 2) * Math.sin(longitudeDistance);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 -a));
        double distance = radiusOfEarth * c *1000;

        double height = this.getElevation() - trackPoint.getElevation();

        distance = Math.pow(distance, 2) + Math.pow(height, 2);

        return Math.sqrt(distance);
    }

    public boolean higherThan(TrackPoint anotherTrackPoint) {
        return elevation > anotherTrackPoint.elevation;
    }

    public boolean lowerThan(TrackPoint anotherTrackPoint){
        return elevation < anotherTrackPoint.elevation;
    }

    public double elevationDifference(TrackPoint anotherTrackPoint) {
        return Math.abs(anotherTrackPoint.elevation - elevation);
    }


}
