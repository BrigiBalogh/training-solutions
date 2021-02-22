package exam03retake01;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class OwlCounter
{

    private Map<String ,Integer> countOfOwl = new HashMap<>();

    public void readFromFile(BufferedReader reader)throws IOException {
        String line;
        while ((line = reader.readLine())  != null) {
            String[] parts = line.split("=");
            Integer number = Integer.parseInt(parts[1]);
            countOfOwl.put(parts[0],number);
        }
    }

    public Map<String, Integer> getNumberOfOwls(String s)
    {
     Map<String, Integer> counts = new HashMap<>();
     int c = 0;
        for (Map.Entry entry: counts.entrySet())
        {
            if(counts.containsKey(s))
            {
               entry.getValue();
            }
        }
        return counts;
    }
}
