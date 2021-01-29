package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

     List<CatalogItem> catalogItems = new ArrayList<>();


     public void addItem(CatalogItem item) {
         catalogItems.add(item);
     }

     public void addAllItems(List<CatalogItem>catalogItems) {
         for (CatalogItem catalogItem : catalogItems) {
             catalogItems.add(catalogItem);
         }
     }

    public double averagePageNumberOver(int numberOfPages) {
         if (numberOfPages <= 0) {
             throw new IllegalArgumentException("Page number must be positive");
         }
       double sum = 0;
       int db = 0;
       for (CatalogItem catalogItem : catalogItems) {
           int nop = catalogItem.numberOfPagesAtOneItem();
           if (nop > numberOfPages) {
               sum += nop;
               db++;
           }
       }
       if (db == 0) {
           throw new IllegalArgumentException("No page");
       }
       return sum / db;
    }

    public void deleteItemByRegistrationNumber(String registrationNumber) {

         for (int i = 0; i < catalogItems.size(); i++) {
             if (catalogItems.get(i).getRegistrationNumber().equals(registrationNumber)) {
                 catalogItems.remove(i);
                 return;
             }
         }

    }
    private boolean containsTitle(CatalogItem catalogitem, SearchCriteria searchCriteria)  {
        if (searchCriteria.hasTitle()) {
            List<Feature> features = catalogitem.getFeatures();
            for (Feature feature : features) {
                if (searchCriteria.getTitle().equals(feature.getTitle())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria){
         List<CatalogItem> filteredItem = new ArrayList<>();
         for ( CatalogItem catalogitem : catalogItems) {
             if ((!searchCriteria.hasContributor() || catalogitem.getContributors().contains(searchCriteria.getContributor())) &&
                 containsTitle(catalogitem, searchCriteria)) {
                     filteredItem.add(catalogitem);
             }
         }
        return filteredItem;
    }

    public int getAllPageNumber(){
         int sum = 0;
         for (CatalogItem catalogItem : catalogItems) {
             int pag =catalogItem.numberOfPagesAtOneItem();
             sum += pag;
         }
         return sum;
    }

    public List<CatalogItem> getAudioLibraryItems(){
         List<CatalogItem> filteredAudioCatalogItems = new ArrayList<>();
         for (CatalogItem catalogItem : catalogItems) {
             if (catalogItem.hasAudioFeature()) {
                 filteredAudioCatalogItems.add(catalogItem);
             }
         }
         return filteredAudioCatalogItems;

    }

    public int getFullLength() {
         int sum = 0;
         for (CatalogItem catalogItem : catalogItems) {
             int len = catalogItem.fullLengthAtOneItem();
             sum += len;
         }
         return sum;
    }

    public List<CatalogItem> getPrintedLibraryItems(){
         List<CatalogItem>filteredPrintedCatalogItems = new ArrayList<>();
         for (CatalogItem catalogItem : catalogItems) {
             if (catalogItem.hasPrintedFeature()) {
                 filteredPrintedCatalogItems.add(catalogItem);
             }
         }
         return filteredPrintedCatalogItems;

    }
}
