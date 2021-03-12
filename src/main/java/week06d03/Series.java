package week06d03;

import java.util.List;

public class Series {

    enum Type {DEC, INC, RANDOM }

    public Type  calculateSeriesType(List<Integer>numbers) {
        if (numbers.isEmpty() || numbers.size() < 2) {
            throw new IllegalArgumentException("Invalid date !");
        }
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) != numbers.get(i + 1) && numbers.get(i) < numbers.get(i + 1)) {
                decreasing = false;
            } else {
                if (numbers.get(i) != numbers.get(i) + 1 && numbers.get(i) > numbers.get(i) + 1) {
                    increasing = false;
                } else {
                    // egyenlő
                }
            }
        }
        if (increasing) {
            return Type.INC;
        } else if (decreasing) {
            return Type.DEC;
        } else {
            return Type.RANDOM;
        }
    }
}
// függvény, ami kap egy számot és megmondja, hogy prím-e? boolean prime(int number);
// hasonló módszerrel kell megoldani

// van egy int tömbünk, és az a kérdés, hogy csupa páros számot tartalmaz-e?
// Írj rá függvényt boolean onlyEven(int[] array);

/*   A Series osztályban hozz létre egy calculateSeriesType() metódust, mely egész számok listáját kapja,
 és eldönti, hogy növekvő, csökkenő vagy össze-vissza sorozatról van-e szó!
  Feltétel, hogy a bemeneti lista nem tartalmaz egymás után egyenlő értékeket.
   Ha a lista üres, vagy csak egy elemből áll, dobj kivételt! Mivel térnél vissza?  */