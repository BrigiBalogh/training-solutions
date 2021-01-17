package week02d05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Languages {

    public static void main(String[] args) {

        List<String> languages = Arrays.asList("Java","Python", "JavaScript");
        List<String> filtered = new ArrayList<>();

        for (String language : languages) {
            if (language.length() > 5) {
                filtered.add(language);
            }
        }
        System.out.println(filtered);
    }
}
