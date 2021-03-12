package week05d05;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private static final long MIN = 60;

    private List <Song> songs = new ArrayList<>();

    public Playlist(List<Song> songs) {
        this.songs = songs;
    }

    public List<Song> findByLengthGreaterThan(int mins) {
        List<Song> ret = new ArrayList<>();
        for (Song song : songs) {
            if (song.getLengthInSeconds()/MIN > mins) {
                ret.add(song);
            }
        }
        return ret;
    }

}
// int[] szamok = ...;
// System.out.println(Arrays.toString(szamok));
// List<Integer> szamokLista = ...;
// System.out.println(szamokLista.toString());
// Utolsó mentsvár: for ciklus.
/*  Készítsünk egy Song osztályt, melynek az alábbi mezői vannak:

String name
long lengthInSeconds
String artist
A Song konstruktorában ellenőrizd, hogy a name és az artist üres-e!
 Dobj kivételt, ha igen! Ellenőrizd továbbá a lengthInSeconds-ot is, hogy nagyobb legyen, mint 0!
  Készítsünk egy Playlist osztályt, melynek van egy konstruktora, amiben Song-ok listáját fogadja el!
   Írjunk egy metódust findByLengthGreaterThan néven, mely egy int-et vár paraméterként mins néven.
   Azoknak a Song-oknak a listáját adjuk vissza, melyek hosszabbak percben (!),
   mint a Song lengthInSeconds mezője.

Bónusz feladat: Implementáljuk megfelelően a toString metódust a Song és a Playlist osztályban, hogy a Playliset-et kiirva a konzolra olvasható eredményt kapjunk! */