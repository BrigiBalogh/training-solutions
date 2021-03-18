package week08d04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ExamplesStore {


    public List<String> getTitlesOfExamples() {
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(FileReader.class.getResourceAsStream("examples.md")))) {
      // new FileReader().readLines(reader);//

        List<String> examples = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null && line.contains("#")) {
            examples.add(line);
        }
        return examples;
    } catch (IOException ioe) {
        throw new IllegalStateException("Can not read file", ioe);
    }

    }
}
