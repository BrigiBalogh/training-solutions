package week11d02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CourierS {

    public static final String SEPARATOR = " ";

    private List<Ride> rides = new ArrayList<>();


    public void fileRider(String file) {
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine() )!= null) {
                String[] linePart = line.split(SEPARATOR);
                rides.add(new Ride(Integer.parseInt(linePart[0]),
                                   Integer.parseInt(linePart[1]),
                                   Integer.parseInt(linePart[2])));
            }

        }catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file !", ioe);
        }
    }

    public Ride getFirstRideOfWeek() {

        Ride firstRide = rides.get(0);
        for (Ride ride : rides) {
            if (ride.getDayOfWeek() <= firstRide.getDayOfWeek()  )  {
                if (ride.getCountOfRide() == 1) {
                    firstRide = ride;
                }
            }
        }
        return firstRide;
    }

    public List<Integer> getFreeDays() {

        List<Integer> freeDays = new ArrayList<>();
        int[] sumDistance = getSumDistanceOfDay();

        for (int i = 0; i < sumDistance.length; i++) {
            int dayDistance = sumDistance[i];
            if (dayDistance == 0) {
                freeDays.add(i + 1);
            }
        }

        return freeDays;
    }

    public List<Integer> getFreeDaysBoolean() {
        List<Integer> freeDays = new ArrayList<>();
        boolean[] workedOnThatDay = new boolean[7]; // mind false
        boolean[] freeDay = {true, true, true, true, true, true, true};

        for (Ride ride : rides) {
            workedOnThatDay[ride.getDayOfWeek() - 1] = true;
            freeDay[ride.getDayOfWeek() - 1] = false;
        }

        for (int i = 0; i < workedOnThatDay.length; i++) {
            boolean worked = workedOnThatDay[i];
            if (!worked) {
                freeDays.add(i + 1);
            }
        }

        return freeDays;
    }

    public int[] getSumDistanceOfDay() {
        int[] week = new int[7];
        for (Ride ride : rides) {
             week[ride.getDayOfWeek() - 1] += ride.getDistance();
        }
        return week;
    }

}
/* A feladatban egy biciklis futár egy heti munkáját rögzítjük és készítünk statissztikákat.

A futár minden fuvar után feljegyzi, hogy a hét hányadik napján történt a fuvar.
 Ezután azt, hogy az adott nap hányadik fuvarját teljesítette és ezután azt,

  0hogy hány kilométer volt az adott fuvar. A futár egy-egy fuvarját reprezentálja a Ride nevű osztály.

Készítsd el a Courier osztályt. Ez fogja a futárt reprezentálni. Legyen egy metódusa,
ami a mellékelt fájl fuvarjait beolvassa és eltárolja a memóriában. Figyelem a fuvarok nem sorrendben vannak!
 (Készíts magadnak minta fájlt!)

Készíts egy metódust ami visszaadja a hét legelső fuvarjának minden adatát.
 Figyelj arra, hogy nem sorrendben vannak a fuvaraok és lehet, hogy nem is dolgozott az 1-es számú napon.
  Készíts egy metódust, ami visszaadja valamilyen formában, hogy mely napokon nem dolgozott a futár!
   Készíts egy metódust, ami visszaadja valamilyen formában napokra lebontva,
    hogy melyik nap hány kilométert tekert!  */