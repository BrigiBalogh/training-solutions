package exam03;

import java.io.BufferedReader;
import java.io.IOException;

public class Histogram {

    public static final String STAR = "*";
    public static final String BREAK_LINE= "\n";


    public String createHistogram(BufferedReader reader) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine())  != null)
        {
          int number = Integer.parseInt(line);
  //         for (int i = 0; i < number;i++) {
  //             sb.append(STAR);
  //         }
           sb.append(STAR.repeat(number));
           sb.append(BREAK_LINE);
        }
        return sb.toString();
    }
}
