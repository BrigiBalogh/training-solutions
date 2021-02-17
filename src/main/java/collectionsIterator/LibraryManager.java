package collectionsIterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LibraryManager {

    private Set<Book> libraryBooks;

    public LibraryManager(Set<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public Book findBookByRegNumber(int regNumber) {
        Book foundBook;
        Iterator<Book> b = libraryBooks.iterator();

        while (b.hasNext()) {
            foundBook = b.next();
            if ( foundBook.getRegNumber() == regNumber) {
                return foundBook;
            }
        }
        throw new MissingBookException("No books found with regnumber :" + regNumber);
    }

    public int removeBookByRegNumber(int regNumber) {
        Book foundBook;
        Iterator<Book> b = libraryBooks.iterator();

        while (b.hasNext()) {
            if (b.next().getRegNumber() == regNumber) {
                b.remove();
                return regNumber;

            }
        }
        throw new MissingBookException("No books found with regnumber :" + regNumber);

    }

    public Set<Book> selectBooksByAuthor(String author) {
        Set<Book> booksByAuthor = new HashSet<>();

        Book foundBook;
        Iterator<Book> b = libraryBooks.iterator();

        while (b.hasNext()) {
            foundBook = b.next();
            if ( foundBook.getAuthor().equals(author)) {
                booksByAuthor.add(foundBook);
            }
        }
        if (booksByAuthor.isEmpty()) {
        throw new MissingBookException(" No books found with author :"  + author);
        }
        return booksByAuthor;
    }

    public int libraryBooksCount(){
        return libraryBooks.size();
    }
}
