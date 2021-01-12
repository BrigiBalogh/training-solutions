package week10d05;

public class Photo implements Qualified{

    private String name;
    private Quality quality;



    public Photo(String name) {
        this.name = name;
        quality = Quality.NO_STAR;
    }

    public Photo(String name, Quality quality) {
        this.name = name;
        this.quality = quality;
    }

    @Override
    public Quality getQuality() {
        return quality;
    }

    @Override
    public void SetQuality(Quality q) {
        quality = q;
    }

    public String getName() {
        return name;
    }
}
