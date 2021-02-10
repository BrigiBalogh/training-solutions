package week14d01;

import java.util.*;

public class Indexer {

    public Map<Character, List<String>> index(List<String> names) {
        Map<Character,List<String>> result = new HashMap<>();
        for (String name : names) {
            char initial = name.charAt(0);
            if (!result.containsKey(initial)) {
                result.put(initial, new ArrayList<>());
            }
            result.get(initial).add(name);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Indexer().index(Arrays.asList("Odon", "Lujza", "Abraham", "Magdolna")));
// {A=[Abraham], L=[Lujza], M=[Magdolna], O=[Odon]}
    }
}
