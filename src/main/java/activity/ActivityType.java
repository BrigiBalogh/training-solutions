package activity;

public enum ActivityType {
    BIKING(true), HIKING(true), RUNNING(true), BASKETBALLTr(false);

    private boolean hasTrack;

    ActivityType(boolean hasTrack) {
        this.hasTrack = hasTrack;
    }

    public boolean hasTrack() {
        return hasTrack;
    }
}
