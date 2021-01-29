package week12d05;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IndexTest {

    @Test
    void testWordCounter() {
        Index index = new Index();
        InputStream is =IndexTest.class.getResourceAsStream("index.html");

        Path file = Path.of("index.html");
        int counter = index.wordCounter("koronavírus",new BufferedReader(new InputStreamReader(is)));
        assertEquals(12,counter);
    }
}