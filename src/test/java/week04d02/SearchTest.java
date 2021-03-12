package week04d02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SearchTest {

    @Test
    void testGetIndexesOfChar() {
        Search search = new Search();
        List<Integer>indices = search.getIndexesOfChar("alma",'a');
        assertEquals(2, indices.size());
        assertEquals(0, indices.get(0));
        assertEquals(3, indices.get(1));
    }

    @Test
    void testFoundOneIndexOfChar(){
        Search search = new Search();
        List<Integer>indices = search.getIndexesOfChar("alma",'l');
        assertEquals(1, indices.size());
        assertEquals(1, indices.get(1));
    }

    @Test
    void testFoundNotIndexOfChar() {
        Search search = new Search();
        List<Integer> indices = search.getIndexesOfChar("alma", 'z');
        assertEquals(0, indices.size());
    }
    // egy darab vizsgált betű van (alma és l)
    // nulla darab vizsgált betű van (alma, z)
}