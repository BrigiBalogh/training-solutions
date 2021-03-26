package week11d03;

public class CharCounter {

    public int countChars(String[] chars) {
        if (chars == null || chars.length == 0)
            return 0;
        String first = chars[0];
        int count = 0;
        for (char c : first.toCharArray()) {
            if (allContains(chars, c)) {
                count++;
            }
        }
        return count;
    }

    private boolean allContains(String[] chars, char c) { // primtesztelő: keressük az osztót
        for (String str : chars) {
            if (!str.contains(c+"")) { // str.contains(String.valueOf(c)) // str.contains(Character.toString(c))
                return false; // ha találunk ellenpéldát, kilépünk
            }
        }
        return true;
    }
}
