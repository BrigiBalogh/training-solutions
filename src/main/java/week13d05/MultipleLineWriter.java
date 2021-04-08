package week13d05;

public class MultipleLineWriter implements LineWriter {


    @Override
    public String writeLine(BillItem item) {
        return String.format("%s %d * %d = %d", item.getName(), item.getNumber(),
                item.getUnitPrice(), item.getNumber()* item.getUnitPrice());
    }
}
