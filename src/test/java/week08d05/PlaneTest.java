package week08d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlaneTest {

    @Test
    void foundLongestOceanPart() {
        Plane p = new Plane();
        int length = p.foundLongestOceanPart("/map1.txt");
        assertEquals(16, length);
    }

    @Test
    void foundLongestOceanPartNoIsland() {
        Plane p = new Plane();
        int length = p.foundLongestOceanPart("/map_noisland.txt");
        assertEquals(65, length);
    }
}