package week12d01;

import java.util.Arrays;
import java.util.Comparator;

public class GoodsPacker {

    public int packGoods(int[][] types, int capacity) {
        Arrays.sort(types, new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
                double o1UnitPrice = (double)o1[1] / o1[0];
                double o2UnitPrice = (double)o2[1] / o2[0];
                if (o1UnitPrice > o2UnitPrice) {
                    return +1;
                } else if (o1UnitPrice == o2UnitPrice) {
                    return 0;
                } else {
                    return -1;
                }
            }
        }.reversed()); // vagy reversed() helyett +1 és -1 csere!
        int price = 0;
        int remainingCapacity = capacity;
        for (int i = 0; i < types.length; i++) {
            int count = remainingCapacity / types[i][0];
            price += count * types[i][1];
            remainingCapacity %= types[i][0];
        }
        return price;
    }

    public static void main(String[] args) {
        GoodsPacker gp = new GoodsPacker();
        int price = gp.packGoods(new int[][]{{7, 160}, {3,90}, {2,15}}, 20);
        System.out.println(price);
    }
}

/*  Készíts egy GoodsPacker osztályt, melynek van egy int packGoods(int[][] types, int capacity)
metódusa.
 A types tömb számpárokat tartalmaz, melyek tárgyak súlyát és értékét tartalmazzák,
 például: [(7, 160), (3, 90), (2, 15)]. Az első szám a súly kilogrammban, a második szám az érték forintban.
  A feladat az, hogy kiszámoljuk, hogy a megadott táskamérethez (capacity) mennyi a tárgyak maximum értéke,
   amit belepakolhatunk a táskába. Például ha a types [(7, 160), (3, 90), (2, 15)] és a capacity 20,
    akkor a maximum érték 555. */