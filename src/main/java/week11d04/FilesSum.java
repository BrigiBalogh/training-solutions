package week11d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesSum {

    public int readFile(String name) {
       // Path path = Path.of(name);
        try {
            String fileContent = Files.readString(Path.of(name));
            int number = Integer.parseInt(fileContent);
            return number;
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file !", e);
        }
    }

    public int sumNumbers() {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            //  String fileName = "number" + (i < 10 ? "0" + i : i) + ".txt";
//            String fileName;
//            if ( i < 10) {
//               fileName = "number0" + i + ".txt";
//            }
//            else {
//                fileName = "number" + i + ".txt";
//            }
            String fileName = String.format("number%02d.txt", i);

            System.out.println(i);

            if ( Files.isRegularFile(Path.of(fileName))) {
                System.out.println("found");
                int number = readFile(fileName);
                sum += number;
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(new FilesSum().sumNumbers());
    }

    
}
