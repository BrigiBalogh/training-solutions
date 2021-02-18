package collectionsclass;

import java.util.ArrayList;
import java.util.List;

public class CollectionManager {

    private List<Book> library = new ArrayList<>();

    public CollectionManager(List<Book> library) {
        this.library = library;
    }

    public List<Book> createUnmodifiableLibrary() {
    }
    public List<Book> reverseLibrary() //az eredeti lista másolatán dolgozik!
    public Book getFirstBook() //a legrégebbi (legkisebb id) könyvet adja vissza
    public Book getLastBook() // a legújabb (legnagyobb id) könyvet adja vissza

}