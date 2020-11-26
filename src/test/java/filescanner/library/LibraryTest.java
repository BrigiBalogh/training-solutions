package filescanner.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTest {
    
    @Test
    public void testLoadFromFile() {
        Library library = new Library();
        
        library.loadFromFile("/books.csv");
        
        assertEquals(4,library.getBooks().size());
        assertEquals("Peter Kelder", library.getBooks().get(4).getAuthor());
    }
}
