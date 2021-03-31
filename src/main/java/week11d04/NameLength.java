package week11d04;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class NameLength {

    public List<Integer> getLengths(List<String> names) {
        Set<Integer> lengths = new TreeSet<>();
        for (String name : names) {
            if (name.charAt(0) == 'J') {
                lengths.add(name.length());
            }
        }
        return new ArrayList<>(lengths);
    }
}
