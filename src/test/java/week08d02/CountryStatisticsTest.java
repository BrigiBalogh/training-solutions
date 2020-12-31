package week08d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountryStatisticsTest {

    @Test
    void readFromFileTest() {
        CountryStatistics cs = new CountryStatistics();
        cs.readFromFile("countries.txt");
        assertEquals(11,cs.getCountries().size());
    }

    @Test
    void mostPopulationTest() {
        CountryStatistics cs = new CountryStatistics();
        cs.readFromFile("countries.txt");
        assertEquals("Kongoi_Demokratikus_Koztarsasag",cs.mostPopulation().getName());

    }
}
