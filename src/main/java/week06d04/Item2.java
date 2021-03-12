package week06d04;

public class Item2 {

    private String name;
    private int quantity;

    public Item2(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}
