package week12d02;

public class SiteS implements Comparable <SiteS>{

    private int side;
    private int width;
    private char color;
    private int numberOfSite;

    public SiteS(int side, int width, char color, int numberOfSite) {
        this.side = side;
        this.width = width;
        this.color = color;
        this.numberOfSite = numberOfSite;
    }

    public int getSide() {
        return side;
    }

    public int getWidth() {
        return width;
    }

    public char getColor() {
        return color;
    }

    public int getNumberOfSite() {
        return numberOfSite;
    }

    @Override
    public int compareTo(SiteS o) {
        return this.width-o.width;
    }
}
