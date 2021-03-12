package week07d04;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ShoppingList {

    public static final String LINE_SEPARATOR = ";";
    public static final int INDEX_OF_AMOUNT = 1;
    public static final int INDEX_OF_PRICE = 2;


    public long calculateSum(String path) {

        long sum = 0;
        List<String> lines;
        try {
             lines = Files.readAllLines(Path.of(path), StandardCharsets.UTF_8);

            for (String line : lines) {
                long result = calculateLineSum(line);
                sum += result;

            }

        }catch(IOException ioe) {
            throw new IllegalStateException("Can not read file",ioe);
        }
        return sum;
    }

    private long calculateLineSum( String line) {
        String[] parts = line.split(LINE_SEPARATOR);

        long amount = Long.parseLong(parts[INDEX_OF_AMOUNT]);
        long price = Long.parseLong(parts[INDEX_OF_PRICE]);

        long result = amount *price;

        return result;
    }
}


/*  A ShoppingList osztályba írj egy long calculateSum(String path) metódust,
 mely a paraméterként átadott fájlból beolvassa a bevásárlólista tartalmát, és összegzi az árat!
 A fájl a következő formátumú sorokat tartalmazza: kenyér;2;30, ahol az első a termék neve,
  a második a darabszám, a harmadik az egységár. Azaz ezen sor esetén 2 * 30 = 60 értékkel kell számolni.


 */