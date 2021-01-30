package week13d02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Airlines {

    private List<Airways> flights= new ArrayList<>();

    public void readOfFile() {
        InputStreamReader isr =new InputStreamReader(Airlines.class.getResourceAsStream("cities.txt"));
        try(BufferedReader reader = new BufferedReader(isr)) {
            String line;
            while(line = reader.readLine() != null) {
                String[] splitLine = line.split("");
            }
        }
    }



}
