package week06d04;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item2> items = new ArrayList<>();

    public void addItem(String name, int quantity) {
        // ha benne van a "name", akkor hozzáadjuk a quantity-t
        Item2 found = null;
        for (Item2 item : items) {
            if (item.getName().equals(name)) {
                found = item;
                break;
            }
        }
        // found != null: benne van, found == null: nincs benne
        if (found != null) {
            found.addQuantity(quantity);
        }
        // ha nincs benne a "name", akkor felvesszük.
        else {
            Item2 newItem = new Item2(name, quantity);
            items.add(newItem);
        }

    }

    public int getItem(String name) {
        for (Item2 item : items) {
            if ( item.getName().equals(name)) {
                return item.getQuantity();
            }
        }
        return 0;
    }

    public List<Item2> getItems() {
        return items;
    }
}
/*  A ShoppingCart osztályba dolgozz! Legyen egy addItem(String name, int quantity) metódusa,
 mellyel új bevásárlólista tételt lehet felvenni (termék neve és mennyisége).
  Az adatokat egy Item listába tárolja. Amennyiben már benne van az adott termék,
  ne újonnan vegye fel,hanem adja hozzá a mennyiséget a már felvett tételhez!
   Lehessen visszakérdezni név alapján a felvett mennyiséget a getItem(String name): int metódussal.
    Ha nem szerepel benne, 0 értéket adjon vissza! */