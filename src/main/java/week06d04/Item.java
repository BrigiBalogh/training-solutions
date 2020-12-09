package week06d04;


public class Item {


    private String name;
    private int price;
    private int month;

    public Item(String name, int price, int month) {
        this.name = name;
        this.price = price;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getMonth() {
        return month;
    }

    private void  checkName(String name) {
        if(name== null ||name.isEmpty()) {
            throw new IllegalArgumentException("Invalid name !");
        }
    }

    private void checkPrice (int price) {
        if (price== 0 ) {
            throw new IllegalArgumentException("Invalid price !");
        }

    }
}

