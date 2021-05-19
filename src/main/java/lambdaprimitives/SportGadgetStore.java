package lambdaprimitives;

import java.util.IntSummaryStatistics;
import java.util.List;

public class SportGadgetStore {


    private List<Product> products;


    public SportGadgetStore(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public int getNumberOfProducts() {
        return products.stream().mapToInt(x -> x.getPiece()).sum();
    }

    public double getAveragePrice() {
        return products.stream().mapToDouble(x -> x.getPrice()).average().orElse(0);
    }

    public String getExpensiveProductStatistics(double minPrice) {
        IntSummaryStatistics ss = products.stream()
                .filter(p -> p.getPrice() > minPrice)
                .mapToInt(Product::getPiece)
                .summaryStatistics();
        if (ss.getCount() != 0) {
            return String.format("Összesen %d féle termék, amelyekből minimum %d db, maximum %d db, összesen %d db van.",
                    ss.getCount(), ss.getMin(), ss.getMax(), ss.getSum());
        } else {
            return "Nincs ilyen termék.";
        }
    }
}
