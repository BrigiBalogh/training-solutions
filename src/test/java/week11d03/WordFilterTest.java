package week11d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordFilterTest {

    @Test
    void testWordsWithChar() {

        WordFilter wordFilter = new WordFilter();
        List<String> item = Arrays.asList("cica","cet", "kutya", "róka", "páva");


        assertEquals(Arrays.asList("cica", "cet"),wordFilter.wordsWithChar(item, 'c'));
        assertEquals(Arrays.asList("kutya", "róka", "páva"),wordFilter.wordsWithChar(item, 'a'));
        assertEquals(Arrays.asList("kutya", "róka"),wordFilter.wordsWithChar(item, 'k'));
    }
}