package lambdacollectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
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
        return orders.stream().flatMap(c -> c.getCoffeeList().stream())
                .collect(Collectors.groupingBy((Coffee cc) -> cc.getType(), Collectors.counting()));
    }

        public double getAverageOrder () {
            //OptionalDouble avg = orders.stream().mapToInt(co -> co.getCoffeeList().size()).average();
            //return avg.orElse(0);
            return orders.stream().mapToInt(co -> co.getCoffeeList().size()).average().orElse(0);
        }
    }