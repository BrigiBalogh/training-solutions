package introconstructors;

import java.util.Arrays;
import java.util.List;

public class Restaurant {

    public static final int SEATS =4;

    private String name;

    private int capacity;

    private List<String> menu;


    public Restaurant(String name,int numberOfTables) {
        this.name = name;
        this.capacity = numberOfTables * SEATS;
        this.menu = generateMenu();
    }

    private List<String> generateMenu() {
            return Arrays.asList("mango smoothie", "banane smoothie","paela");
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<String> getMenu() {
        return menu;
    }
}
