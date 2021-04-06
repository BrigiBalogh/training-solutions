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
            String[] block =new String[4] ;
            while ((block[0] = br.readLine()) != null) {
                data.add(processBlock(br,block));
            }

        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read the file !");
        }
    }

    private Subject processBlock(BufferedReader br, String[] block) throws IOException {
        for (int i = 1; i < 4; i++) {
            String line;
            if (br.readLine() != null) {
                block[i] = br.readLine();
            } else {
                throw new IOException("Wrong file !");
            }
        }
        return new Subject(block[0], block[1], block[2],Integer.parseInt(block[3]));
    }

    public int lessonsTaughtCalculate(String name) {

        int sumHours = 0;
        for (Subject s : data) {
            if (s.getName().equals(name)) {
                sumHours += s.getNumberOfLessons();
            }
        }
        return sumHours;
    }

  /* public int sumLessonsOfTeacherFromFile(String file; String teacherName ) {
        int sum = 0;

        try (BufferedReader br = Files.newBufferedReader(Path.of(file))) {
            String line;
            while(line = br.readLine() != null) {
                skipTwoLines(br);

                if (line.equals(teacherName)) {

                    sum += Integer.parseInt(br.readLine());
                }


            }
        }catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file !", ioe);
        }
        return sum;
    }

    private void skipTwoLines(BufferedReader br) throws IOException {
        br.readLine();
        br.readLine();
    } */
}
