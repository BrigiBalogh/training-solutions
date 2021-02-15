package week15d04;

import java.util.Comparator;

public class CasesDescComparator implements Comparator<Cases> {


    @Override
    public int compare(Cases o1, Cases o2) {
        // o1:416, o2:222
        // o1: 234, o2:234
        // o1: 111, o2:456
        /*if (o1.getCases() > o2.getCases()) {
            return -1; // o1 előrébb kell legyen, mint o2; ha jól állnak, akkor ez.
        } else (o1.getCases() == o2.getCases()) {
            return 0; // o1 és o2 egyenlő
        } else {
            return +1; // o1 hátrébb kell legyen, mint o2; ha fordítva állnak, akkor ez.
        }
        return -1*(o1.getCases() - o2.getCases());
        return -o1.getCases() + o2.getCases();*/
        return o2.getCases() - o1.getCases();
    }
}
