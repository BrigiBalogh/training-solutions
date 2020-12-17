package methodchain.robot;

public class NavigationPoint {

    private int actualDistance;
    private int actualAzimuth;

    public NavigationPoint(int actualDistance, int actualAzimuth) {
        this.actualDistance = actualDistance;
        this.actualAzimuth = actualAzimuth;
    }

    public int getActualDistance() {
        return actualDistance;
    }

    public int getActualAzimuth() {
        return actualAzimuth;
    }

    public String toString() {
        return "distance:" + actualDistance + " azimuth: " + actualAzimuth;
    }
}
