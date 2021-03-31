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
/*Töltsd le a példa bináris állomány
 a https://github.com/Training360/strukturavalto-java-public/raw/master/examples/week12d04/src/main/resources/secret.dat címről!
  Ez bájtokat tartalmaz, egy szöveg van titkosítva benne.
   Olvasd be bájtonként, és mindegyik bájthoz adjál hozzá tízet!
    Ez valójában egy karakterkód, ezt alakítsd át char típusú értékké!
     Majd egymás után írd ki ezeket a konzolra! Ne használj közöttük sortörést! */