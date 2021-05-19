package lambdacollectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Cafe {

    private List<CoffeeOrder> orders;

    public Cafe() {
        orders = new ArrayList<>();
    }

    public Cafe(List<CoffeeOrder> orders) {
        this.orders =orders;
    }

    public List<CoffeeOrder> getOrders() {
        return orders;
    }

    public Map<CoffeeType, Long> getCountByCoffeeType() {
        return orders.stream().flatMap(c -> c.getCoffeeList().stream()
                .collect(Collectors.groupingBy((Coffee c) -> c.getType(), Collectors.counting())));
    }

        public double getAverageOrder () {
            return 0;
        }
    }