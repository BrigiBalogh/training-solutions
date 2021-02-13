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

    public Set<String> getProductsByIdAlphabetical(String id) {
        return shoppings.get(id);
    }

    public int shellByProductsName(String productName) {
        int count =0;
        for (Set <String>p : shoppings.values()) {
            if (p.contains(productName)) {
                count++;
            }
        }
        return count;
    }

    public int itemsByShoppingList(String id) {
        return shoppings.get(id).size();
    }

    public Map<String, Integer> statistics() {
        Map<String, Integer> ret = new HashMap<>();
        for (Set<String>p : shoppings.values()) {
            for ( String product : p) {
               if ( ret.containsKey(product)) {
                  int count = ret.get(product);
                  count++;
                  ret.put(product,count);
               } else {
                   ret.put(product,1);
               }
            }
        }
        return ret;
    }
}
