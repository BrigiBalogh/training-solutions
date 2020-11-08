package localvariables;

public class Distance {

    private double distancelnKm;

    private boolean exact;

    public Distance(double distancelnKm, boolean exact) {
        this.distancelnKm = distancelnKm;
        this.exact = exact;
    }

    public double getDistancelnKm() {
        return distancelnKm ;
    }

    public boolean isExact() {
        return exact;
    }
}