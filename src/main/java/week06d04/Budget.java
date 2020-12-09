package week06d04;

import java.util.ArrayList;
import java.util.List;

public class Budget {

    private List <Item> items;

    public Budget(List<Item> items) {
        this.items = items;
    }


    public List<Item> getItemsByMonth(int monthNumber) {
        List<Item> m = new ArrayList<>();

        for (Item item : items) {
            if (item.getMonth()==monthNumber) {
                m.add(item);
            }
        }
        return m;
    }

    public List<Item> getItems() {
        return items;
    }
}
