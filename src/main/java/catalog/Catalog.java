package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

     List<CatalogItem> catalogItems = new ArrayList<>();

     public void addItem(List<CatalogItem>catalogItems) {
         for (CatalogItem catalogItem : catalogItems) {
             catalogItems.add(catalogItem);
         }
     }

    public double averagePageNumberOver(int numberOfPages) {
       double sum = 0;
       for (CatalogItem catalogItem : catalogItems) {
           sum += catalogItem.numberOfPagesAtOneItem();
       }
       return sum;
    }

    public void deleteItemByRegistrationNumber(String registrationNumber) {

    }

    List<CatalogItem> findByCriteria(SearchCriteria searchCriteria){
         List<CatalogItem>

    }

    public int getAllPageNumber(){
      return
    }

    public List<CatalogItem> getAudioLibraryItems(){
         return

    }

    public int getFullLength() {
         return catalogItems.size() *

    }

    public List<CatalogItem> getPrintedLibraryItems(){

    }
}
