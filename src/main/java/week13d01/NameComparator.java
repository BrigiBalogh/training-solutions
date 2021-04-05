package week13d01;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class NameComparator implements Comparator<City> {

    @Override
    public int compare(City city1, City city2) {
        Collator collator = Collator.getInstance(new Locale("hu", "HU"));
        return collator.compare( city1.getName(), city2.getName());
    }
}
