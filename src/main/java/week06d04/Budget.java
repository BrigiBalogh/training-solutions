package week06d04;

import java.util.ArrayList;
import java.util.List;

public class Budget {

    private List <Item> items;

    public Budget(List<Item> items) {
        this.items = new ArrayList<>(items);
    }


    public List<Item> getItemsByMonth(int date) {
        if (date < 1 || date > 12) {
            throw new IllegalArgumentException( "Invalid date !");

        }
        List<Item> m = new ArrayList<>();

        for (Item item : items) {
            if (item.getMonth()== date) {
                m.add(item);
            }
        }
        return m;
    }

    public List<Item> getItems() {
        return items;
    }
}
