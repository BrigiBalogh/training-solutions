package week06d03;

public class WordEraser {


    public String eraseWord(String words, String word) {
        StringBuilder sb = new StringBuilder();
        String [] s = words.split("");
        for (String S : s ) {
            if ( !S.equals(word)) {
                sb.append(S).append("");
            }
        }
        return sb.toString().trim();
    }
}
