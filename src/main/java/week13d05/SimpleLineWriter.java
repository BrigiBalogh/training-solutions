package week13d05;

public class SimpleLineWriter implements LineWriter {

    @Override
    public String writeLine(BillItem item) {
        return String.format("%d %s, darabja %d Ft", item.getNumber(), item.getName(),
                item.getUnitPrice());
    }
}
