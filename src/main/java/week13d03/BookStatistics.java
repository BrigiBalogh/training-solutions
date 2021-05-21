package week13d03;

import com.google.protobuf.MapEntry;

import java.util.*;
import java.util.stream.Collectors;

public class BookStatistics {


    public String findAuthorWithMostNumberOfPages(List<Book> books) {

        if (books.isEmpty()) {
            throw new IllegalArgumentException("No book  found !");
        }
        Map<String, Integer> booksMap = new HashMap<>();
        for (Book book : books) {
            String author = book.getAuthor();
            if (!booksMap.containsKey(author)) {
                booksMap.put(author, book.getNumberOfPages());
            }
            else {
                int sum = booksMap.get(author);
                sum += book.getNumberOfPages();
                booksMap.put(author,sum);

            }
        }
        int maxNumberOfPages = 0;
        String author = null;
        for (Map.Entry<String,Integer> entry : booksMap.entrySet() ) {
            if (entry.getValue() > maxNumberOfPages) {
                maxNumberOfPages = entry.getValue();
                author = entry.getKey();
            }
        }
        return author;
    }

   /* public Optional<String> findAuthorWithMostNumberOfPages1(List<Book> books) {
        if(books.isEmpty()) {
            return Optional.empty();
        }
        Map<String, Integer> booksMap = new HashMap<>();
        for(Book book : books) {
            String author = book.getAuthor();

           // int value = booksMap.getOrDefault(author,0);
          //  value += book.getNumberOfPages();
         //   booksMap.put(author, value);

            booksMap.merge(author,
                    book.getNumberOfPages(),
                    (x,y) -> x + y );
            // vagy Integer :: sum
            // melyik könyv a leghosszabb ? (x, y) -> x > y ? x : y vagy (x, y ) -> Math.max(x, y)
            // vagy Math :: max
        }
       // public static int add(int i, int j){
        //    return i + j;
       // }
        return Optional.of(author);
    }*/

    public  Optional<String> findAuthorWithMaxPageWithStream(List<Book> books) {
        Map<String, Integer> m = books.stream()
                .collect(Collectors.groupingBy(b -> b.getAuthor(), // Book :: getAuthor
                        Collectors.summingInt(b -> b.getNumberOfPages())));  // Book :: getNumberOfPages

        return m.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue)).
                map(Map.Entry::getKey);

    }
}
