package week08d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Plane {

    private static final char OCEAN = '0';
    private static final char ISLAND = '1';
    private static final int EOF = -1; // end of file

    public int  foundLongestOceanPart(String file) {
        //Path file = Path.of("map.txt");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(Plane.class.getResourceAsStream(file)))) {
            int ch;
            int oceanLength = 0;
            int maxOceanLength = 0;
            while ((ch = br.read()) != EOF) {
                if (ch == OCEAN) {
                    oceanLength++;
                    if (oceanLength > maxOceanLength) {
                        maxOceanLength = oceanLength;
                    }
                    //System.out.println("ocean");
                } else { // ISLAND
                    oceanLength = 0;
                    //System.out.println("island");
                }
            }
            return maxOceanLength;
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }

    }

}
