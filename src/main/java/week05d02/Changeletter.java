package week05d02;

public class Changeletter {

    public static final String VOWELS = "aeiou";

    public String changeVowels(String str) {
        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i< str.length(); i++) {
            String v = str.substring(i, i + 1);
            if (VOWELS.contains(v)) {
                sb.append("*");
            } else {
                sb.append(v);
            }
        }
        return sb.toString();
    }
}
