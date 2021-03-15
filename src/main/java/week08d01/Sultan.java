package week08d01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sultan {

    public boolean[] getOpenDoors() {
        boolean[] result = new boolean[100];

        for (int day = 1; day <= 100; day++) {
            for (int cell = 0; cell < result.length; cell++) {
                if ((cell+1) % day == 0) {
                    result[cell] = !result[cell];
                }
            }
        }
        return result;
    }

    public List<Integer> getOpenDoorsList() {
        boolean[] result = getOpenDoors();
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < result.length; i++) {
            if (result[i]) {
                ret.add(i+1);
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Sultan sultan = new Sultan();
        boolean[] res = sultan.getOpenDoors();
        System.out.println(Arrays.toString(res));
        System.out.println(sultan.getOpenDoorsList());
    }
}

/*   A török szultán elhatározza, hogy a 100 nap múlva lévő születésnapján szabadon enged néhány rabot
 a börtönéből. A börtönben 100 cella van. Mindegyik cella zárva van. Ha egyet fordítunk a kulcson akkor
 nyitva lesz, ha még egyet akkor zárva ha hármat akkor ismét nyitva és így tovább.
  A szultán azt a parancsot adja, hogy az első nap mindegyik cellán fordítsanak egyet.
   (Ekkor minden cella nyitva lesz). A második napon minden másodikon fordítsanak egyet,
    így minden második zárva lesz. A harmadik napon minden harmadikon fordítsanak egyet így a 3. cella zárva ,
     de a 6. cella például nyitva lesz. A week08d01.Sultan osztályba írj egy metódust openDoors() néven,
      aminek visszatérési értékéből kiderül, hogy mely ajtók lesznek nyitva a 100. napon!
       Az osztály szabadon bővíthető!   */