package week14d02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Shopping {
    private Map<String, Set<String>> shoppings = new HashMap<>();

    public void loadShopping(Path path) {
        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                String[] lineParts = line.split(" ");
                String[] products = lineParts[1].split(",");
                shoppings.put(lineParts[0], Set.of(products));
            }
        } catch (IOException e) {
            throw new IllegalStateException("cannot read file", e);
        }
    }


}
