package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionManager {

    private List<Book> library = new ArrayList<>();

    public CollectionManager(List<Book> library) {
        this.library = library;
    }

    public List<Book> createUnmodifiableLibrary() {
        return Collections.unmodifiableList(library);
    }
    public List<Book> reverseLibrary() {
        List <Book> books = new ArrayList<>(library);
        Collections.sort(books);
        Collections.reverse(books);
        return books;
    }
    public Book getFirstBook() {
       return Collections.min(library);


    }
    public Book getLastBook() {
        return Collections.max(library);
    }

}