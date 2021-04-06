package week13d03;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
}
