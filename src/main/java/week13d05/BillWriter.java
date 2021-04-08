package week13d05;

import java.util.List;

public class BillWriter {

    public String writeBills(List<BillItem> items,LineWriter lineWriter) {

        StringBuilder sb = new StringBuilder();

        for (BillItem billItem : items) {
            String line = lineWriter.writeLine(billItem);
            sb.append(line).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        BillWriter billWriter = new BillWriter();
        List<BillItem> billItems = List.of(
                new BillItem("kenyér", 3, 10),
                new BillItem("tej", 5, 20)
        );
       // String result = billWriter.writeBills(billItems, new  SimpleLineWriter());
        String result = billWriter.writeBills(billItems,item -> item.getName());
        System.out.println(result);
    }
}
