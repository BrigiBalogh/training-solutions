package exam03retake02;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class BalatonStorm {


    public List<String> getStationsInStorm(BufferedReader reader) {
        List<String> ret = new ArrayList<>();
        try {
            reader.readLine();
            String line;
            while ((line = reader.readLine()) != null && !line.contains("]")) {
                String secondLine = reader.readLine();
                String thirdLine = reader.readLine();
                // thirdLine: "allomas"
                String[] parts = thirdLine.split(":");
                String[] nameParts = parts[1].split("\"");
                String stationName = nameParts[1];
                String fourthLine = reader.readLine();
                String fifthLine = reader.readLine();
                String sixthLine = reader.readLine();
                String seventhLine = reader.readLine();
                // seventhLine: "level"
                String[] levelParts = seventhLine.split(":");
                String trimmedLevel = levelParts[1].trim();
                int level = Integer.parseInt(trimmedLevel.substring(0, trimmedLevel.length()-1));
                String eigthLine = reader.readLine();
                String ninthLine = reader.readLine();
                String tenthLine = reader.readLine();
                if (level >= 3) {
                    ret.add(stationName);
                }
            }
            Collections.sort(ret, Collator.getInstance(new Locale("hu", "HU")));
            return ret;
        } catch (IOException ex) {
            throw new IllegalArgumentException("file cannot be read");
        }
    }
}
