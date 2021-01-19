package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature {

    private List<String> composer;
    private int length;
    private List<String> performers;
    private String title;

    public AudioFeatures(int length, List<String> performers, String title) {
        this.length = length;
        this.performers = new ArrayList<>(performers);
        this.title = title;
    }

    public AudioFeatures(List<String> composer, int length, List<String> performers, String title) {
        this.composer = composer;
        this.length = length;
        this.performers = performers;
        this.title = title;
    }

    public int getLength() {
        return length;
    }



    @Override
    public List<String> getContributors(List<String>composer,List<String>performers) {
        return ;

    }

    @Override
    public String getTitle() {
        return title;
    }
}
