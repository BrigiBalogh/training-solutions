package collectionscomp;

import java.text.Collator;
import java.util.*;

public class OrderedLibrary {

    private List<Book> libraryBooks = new LinkedList<>();


    public OrderedLibrary(List<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public List<Book> orderedByTitle() {
        List<Book> orderedList = new ArrayList<>(libraryBooks);
        Collections.sort(orderedList);

        return orderedList;
    }

    public List<Book> orderedByAuthor() {
        List<Book> orderList = new ArrayList<>(libraryBooks);
        Collections.sort(orderList, new AuthorComparator());

        return orderList;

    }

    public List<String> orderedByTitleLocale(Locale locale) {

        List<String> orderList = new ArrayList<>();
        for ( Book b : libraryBooks) {
            orderList.add(b.getTitle());
        }

        Collator hungarianCollator = Collator.getInstance(locale);
        hungarianCollator.setStrength(Collator.PRIMARY);
        Collections.sort(orderList, hungarianCollator);

        return orderList;

    }
}
