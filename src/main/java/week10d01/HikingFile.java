package week10d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HikingFile {



    public HikingStat getPlusElevation(InputStream inputStream) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            List<Double> elevation = new ArrayList<>();

          String  line;
          while ((line = br.readLine()) != null) {
              String[] parts = line.split(",");
              double height =Double.parseDouble( parts[2]);
              elevation.add(height);
          }

          double sumAscent = 0;
          double sumDescent = 0;

          for (int i = 0; i+1 < elevation.size(); i++) {
              if (elevation.get(i) < elevation.get(i+1)) {
                  sumAscent += elevation.get(i+1)-elevation.get(i);
              }
              if (elevation.get(i) > elevation.get(i+1)) {
                  sumDescent += elevation.get(i) - elevation.get(i+1);
              }
          }
          return new HikingStat(sumAscent,sumDescent);

        } catch (IOException e) {
            throw new IllegalStateException("File cannot be read.", e);
        }
    }
}
