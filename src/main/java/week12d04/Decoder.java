package week12d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Decoder {

    public void decode(Path path) {
        try {
            byte[] bytes = Files.readAllBytes(path);
            for(byte b : bytes) {
                char c = (char) (b + 10);
                System.out.print(c);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not decode file !", ioe);
        }

    }

    public static void main(String[] args) {
        new Decoder().decode(Path.of("secret(1).dat"));
    }
}
