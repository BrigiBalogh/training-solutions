package lambdastreams.baseoperations;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers {

    List<Integer> digits;

    public Numbers(List<Integer> digits) {
        this.digits = digits;
    }

    public Optional<Integer> min() {
        return digits.stream().min(Comparator.naturalOrder());
    }

    public int sum() {
        return digits.stream().reduce(0,(a,b) -> a + b);
    }

    public Set<Integer> getDistinctElements() {
        return digits.stream().collect(Collectors.toSet());
    }

    public boolean isAllPositive() {
        return digits.stream().allMatch(x -> x > 0);
    }
}
