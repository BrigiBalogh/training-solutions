package week13d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SubjectStatistics {

    private List<Subject> data = new ArrayList<>();

    public void readFromFile(String fileName) {
        try(BufferedReader br = Files.newBufferedReader(Path.of(fileName))) {
            String line;
            while (line = br.readLine() != null) {

            }

        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read the file !");
        }
    }
}
