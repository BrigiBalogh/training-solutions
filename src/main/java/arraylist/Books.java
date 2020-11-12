package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Books {

  private   List<String> booksOfTitles= new ArrayList<>();

  public void add(String title) {
      booksOfTitles.add(title);
  }

  public List<String> findAllByPrefix(String prefix) {
   List<String> hit=new ArrayList<>();
   for (String title:booksOfTitles) {
       if (title.startsWith(prefix)) {
           hit.add(title);
       }
   }
   return hit;
  }

  public List<String> getBooksOfTitles() {
      return booksOfTitles;
  }

  public void removeByPrefix(String prefix) {
      List<String> toDelete=new ArrayList<>();
      for (String title:booksOfTitles) {
          if (title.startsWith(prefix)) {
              toDelete.add(title);
          }
      }
      booksOfTitles.removeAll(toDelete);
  }

    public static void main(String[] args) {
        Books books= new Books();
        books.add("Kundalini-jóga");
        books.add("A Vaszistha jóga");
        books.add("A fiatalság forrása");
        books.add("A rádzsa-jóga");

        System.out.println(books.getBooksOfTitles());

        System.out.println(books.findAllByPrefix("rádzsa"));

        books.removeByPrefix("rádzsa");
        System.out.println(books.getBooksOfTitles());
    }


}
