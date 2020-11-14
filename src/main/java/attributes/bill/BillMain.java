package attributes.bill;

public class BillMain {

    public static void main(String[] args) {
        Bill bill = new Bill();
        bill.addItem(new Item("rózsa",5,1_000));
        bill.addItem(new Item("szegfű",3,800));
        bill.addItem(new Item("liliom",7,700));

        System.out.println(bill.calculateTotalPrice());
    }
}
