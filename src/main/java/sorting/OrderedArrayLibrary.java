package sorting;

import java.util.Arrays;
import java.util.Comparator;

public class OrderedArrayLibrary {

    private Book[] bookArray;

    public OrderedArrayLibrary(Book[] bookArray) {
        this.bookArray = bookArray;
    }

    public Book[] sortingById(){
        Book[] books = new Book[bookArray.length];
        System.arraycopy(bookArray,0,books,0,bookArray.length);
        Arrays.sort(books);
        return books;
    }

    public Book[] sortingByTitle() {
        Comparator<Book> titleComparator = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        };


        Book[] books = new Book[bookArray.length];
        System.arraycopy(bookArray,0,books,0,bookArray.length);
        Arrays.sort(books);
        return books;

    }


}
