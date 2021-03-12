package week06d01;

import java.util.List;

public class ListSelector {

    public String getEvenElements(List<String > words) {
        StringBuilder sb = new StringBuilder();

        if (words == null) {
            throw new IllegalArgumentException("Text is empty !");
        }
        if (words.size() != 0) {
            sb.append("[");
            for (int i = 0; i < words.size(); i += 2) {
                sb.append(words.get(i));
                sb.append(" ");
            }
            sb.deleteCharAt(sb.length()-1);
            sb.append("]");
        }
        return sb.toString();
    }
}
