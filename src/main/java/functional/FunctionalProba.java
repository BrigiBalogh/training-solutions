package functional;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalProba {
    public static void main(String[] args) {
        Comparator<String> cmp = (c1, c2) -> c1.compareTo(c2);
        Feltetel paros = (szam) -> szam % 2 == 0;
        /*Feltetel parosAnon = new Feltetel() {

            @Override
            public boolean feltetel(int szam) {
                return szam % 2 == 0;
            }
        };*/
        List<Integer> szamok = List.of(3,7,5,4,8,6);
        kivalogatParos(szamok);
        kivalogatNagyobb(szamok);
        kivalogat(szamok, paros);
        kivalogat(szamok, sz -> sz > 6);
        Predicate<Integer> p = n -> n > 6;
        kivalogatPred(szamok, p);

        Consumer c;
        System.out.println("Funkcionális:");
        szamok.stream().filter(p).forEach(sz -> System.out.print(sz+" "));
        System.out.println();
        List<Integer> result = szamok.stream().filter(sz -> sz % 2 == 1).collect(Collectors.toList());
        System.out.println(result);

        List<Student> students = List.of(new Student("Kipsz Jakab", 2000, 3.4),
                new Student("Kiss Klári", 2001, 4.5),
                new Student("Am Erika", 2002, 4.1));

        List<Student> result1 = students.stream().filter(student -> student.getAverage() > 4).collect(Collectors.toList());
        System.out.println(result1);

        List<String> names = students.stream().map(student -> student.getName()).collect(Collectors.toList());
        System.out.println(names);

        List<String> namesAvg = students.stream()
                .filter(student -> student.getAverage() > 4)
                .map(student -> student.getName())
                .collect(Collectors.toList());
        System.out.println(namesAvg);

        students.stream()
                .filter(student -> student.getName().startsWith("K"))
                .forEach(student -> System.out.print(student.getName()+" "));

        students.stream()
                .map(s -> s.getName())
                .filter(n -> n.startsWith("K"))
                .forEach(n -> System.out.print(n+" "));

        System.out.println();
        students.stream()
                .forEach(student -> System.out.println(student.getName()+" ("+student.getBirthYear()+"; "+student.getAverage()+")"));


    }

    private static void kivalogatPred(List<Integer> szamok, Predicate f) {
        for (int sz : szamok) {
            if (f.test(sz)) {
                System.out.print(sz+" ");
            }
        }
        System.out.println();
    }

    private static void kivalogat(List<Integer> szamok, Feltetel f) {
        for (int sz : szamok) {
            if (f.feltetel(sz)) {
                System.out.print(sz+" ");
            }
        }
        System.out.println();
    }

    private static void kivalogatNagyobb(List<Integer> szamok) {
        for (int sz : szamok) {
            if (sz > 5) {
                System.out.print(sz+" ");
            }
        }
        System.out.println();
    }

    private static void kivalogatParos(List<Integer> szamok) {
        for (int sz : szamok) {
            if (sz % 2 == 0) {
                System.out.print(sz+" ");
            }
        }
        System.out.println();
    }
}
