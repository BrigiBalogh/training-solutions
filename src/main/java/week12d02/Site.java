package week12d02;

public class Site {

    private int site;
    private int length;
    private Fence fenceType;

    public Site(int site, int length, Fence fence) {
        this.site = site;
        this.length = length;
        this.fenceType = fenceType;
    }

    public int getSite() {
        return site;
    }

    public int getLength() {
        return length;
    }

    public Fence getFenceType() {
        return fenceType;
    }
}
