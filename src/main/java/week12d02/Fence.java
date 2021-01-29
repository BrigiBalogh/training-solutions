package week12d02;

public enum Fence {
    PERFECT(0), NEED_UPGRADE(1), NO_FENCE(2);

    private int index;

    Fence(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
