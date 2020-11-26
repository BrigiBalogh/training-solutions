package filescanner.bucketlist;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class BucketList {

    public static void main(String[] args) {
        try(Scanner scanner= new Scanner(Path.of("bucketlist.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println();
            }
        } catch (IOException ioe) {
            System.out.println("Can't read bucketlist.txt file.");
        }
    }
}
