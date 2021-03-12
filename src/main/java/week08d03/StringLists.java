package week08d03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringLists {

    public List<String> stringListsUnion(List<String>first, List<String>second) {
        List<String> result = new ArrayList<>(first);

        for (String s : second) {
            if (!result.contains(s)) {
                result.add(s);
            }
        }
        Collections.sort(result);
        return result;

    }
    /* Készíts week08d03 csomagban egy StringLists osztályt és benne egy
    stringListsUnion(List<String> first, List<String> second) metódust,
     mely két string listát vár paraméterül és visszaadja az uniójukat.
     Az úniónak minden elemet tartalmaznia kell mindkét listából, de egy elem nem szerepelhet kétszer! */

    public List<String> shortestWords(List<String> words) {
        List<String> result = new ArrayList<>();

        int minLength = words.get(0).length();
        for (String s : words) {
            if (s.length() < minLength) {
                result.clear();
                minLength = s.length();
            }
            if (s.length() == minLength) {
                result.add(s);
            }
        }
        return result;
    }
}

/* Készíts a week08d03 csomagban egy StringLists osztályt és benne egy
 shortestWords(List<String> words) metódust, mely paraméterül kap egy String listát és a legrövidebb szavakat
  vissza adja belőle egy Listában. PL :{"aaa", "aa", "bb", "cccc", "dd"}
   Itt a legrövidebb szavak az "aa", "bb", "dd". */