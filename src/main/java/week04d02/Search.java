package week04d02;

import java.util.ArrayList;
import java.util.List;

public class Search {

  public List<Integer> getIndexesOfChar(String s, char c) {
    List<Integer> result = new ArrayList<>();

    for (int i = 0 ; i < s.length(); i ++) {
      if (s.charAt(i) == c) {
          result.add(i);
      }
    }
    return result;
  }
}
