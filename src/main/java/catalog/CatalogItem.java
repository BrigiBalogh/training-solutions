package catalog;

import java.util.ArrayList;
import java.util.List;

public class CatalogItem {

   private List<Feature> features = new ArrayList<>();
   private int price;
   private String registrationNumber;

    public CatalogItem(List<Feature> features, int price, String registrationNumber) {
        this.features = features;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public int fullLengthAtOneItem (){
        return ;
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

    public List<String> getContributors(){
        return;
    }

    public boolean hasAudioFeature(){


    }

    public boolean hasPrintedFeature(){

    }

    public int numberOfPagesAtOneItem(){
        return

    }
}
