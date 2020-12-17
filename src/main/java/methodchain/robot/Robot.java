package methodchain.robot;

import java.util.ArrayList;
import java.util.List;

public class Robot {

    private int distance;
    private int azimuth;
    private List<NavigationPoint> navigationPoints = new ArrayList<>();


    public int getDistance() {
        return distance;
    }

    public int getAzimuth() {
        return azimuth;
    }

    public List<NavigationPoint> getNavigationPoints() {
        return navigationPoints;
    }

    public Robot go(int meter) {
        this.distance += meter;
        return this;
    }

    public Robot rotate(int angle) {
        this.azimuth += angle;
        return this;
    }

    public Robot registerNavigationPoint() {
        this.navigationPoints.add(new NavigationPoint(this.distance, this.azimuth));
        return this;
    }



}
