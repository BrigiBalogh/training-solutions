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
                List<String> stations = readStationData(reader);
                String stationName = parseStationName(stations.get(1));

                String seventhLine = stations.get(5);
                int level = parseLevel(seventhLine);
                if (level >= 3) {
                    ret.add(stationName);
                }

              /* String secondLine = reader.readLine();
               String thirdLine = reader.readLine();
                String[] parts = thirdLine.split(":");
                String[] nameParts = parts[1].split("\"");
                String stationName = nameParts[1];
                String fourthLine = reader.readLine();
                String fifthLine = reader.readLine();
                String sixthLine = reader.readLine();
                String seventhLine = reader.readLine();
                String[] levelParts = seventhLine.split(":");
                String trimmedLevel = levelParts[1].trim();
                int level = Integer.parseInt(trimmedLevel.substring(0, trimmedLevel.length()-1));
                String eigthLine = reader.readLine();
                String ninthLine = reader.readLine();
                String tenthLine = reader.readLine();
                if (level >= 3) {
                    ret.add(stationName);
                } */
            }
            Collections.sort(ret, Collator.getInstance(new Locale("hu", "HU")));
            return ret;
        } catch (IOException ex) {
            throw new IllegalArgumentException("file cannot be read",ex);
        }
    }

    private List<String> readStationData(BufferedReader reader) throws IOException {
        List<String> stations = new ArrayList<>();

        for (int i= 0; i < 9; i++) {
            stations.add(reader.readLine());
            //String l = reader.readLine();
            //stations.add(l);
        }
        return stations;
    }

    private int parseLevel(String seventhLine) {
        String[] levelParts = seventhLine.split(":");
        String trimmedLevel = levelParts[1].trim();
        int level = Integer.parseInt(trimmedLevel.substring(0, trimmedLevel.length()-1));
        return level;
    }

    private String parseStationName(String thirdLine) {
        String[] parts = thirdLine.split(":");
        String[] nameParts = parts[1].split("\"");
        String stationName = nameParts[1];
        return stationName;
    }
}
