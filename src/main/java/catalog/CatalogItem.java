package catalog;

import java.util.ArrayList;
import java.util.List;

public class CatalogItem {

   private List<Feature> features = new ArrayList<>();
   private int price;
   private String registrationNumber;

    public CatalogItem(String registrationNumber, int price, List<Feature> features) {
        this.features = features;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public int fullLengthAtOneItem (){
       int sum = 0;
        for (Feature feature : features) {
            if ( feature instanceof AudioFeatures) {
              int length = ((AudioFeatures) feature).getLength();
                sum += length;
            }
        }
        return sum ;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>();
        for (Feature feature : features) {
            contributors.addAll(feature.getContributors());
        }
        return contributors;
    }

    public boolean hasAudioFeature(){

        for (Feature feature : features) {
            if (feature instanceof AudioFeatures) {
                return true;
            }
        }
        return false;
    }

    public boolean hasPrintedFeature(){
        for (Feature feature : features) {
            if(feature instanceof PrintedFeatures) {
                return true;
            }
        }
        return false;
    }

    public int numberOfPagesAtOneItem(){
        int sum = 0;
        for (Feature feature : features) {
            if (feature instanceof PrintedFeatures) {
                int pages = ((PrintedFeatures)feature).getNumberOfPages();
                sum += pages;
            }
        }
        return sum;
    }
 public List<String> getTitles() {
        List<String> titles = new ArrayList<>();
        for (Feature feature : features) {
            titles.add(feature.getTitle());
        }
        return titles;
 }

}
