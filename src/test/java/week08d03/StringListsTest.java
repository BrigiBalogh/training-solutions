package week08d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringListsTest {

    @Test
    void unionTest() {
        List<String>first = Arrays.asList("a","b","c");
        List<String>second = Arrays.asList("a","d");
        StringLists sl = new StringLists();

        assertEquals(Arrays.asList("a","b","c","d"),sl.stringListsUnion( first, second));
    }

    @Test
    void shortestWordsTest() {
        StringLists stringLists = new StringLists();
        List<String> input = Arrays.asList("aaa","aa","bb","cccc","dd");
        List<String> expectedOutput =Arrays.asList("aa","bb","cc");
        assertEquals(expectedOutput, stringLists.shortestWords(input));
    }
}
