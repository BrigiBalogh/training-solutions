package exercise;

public class StringUpperCaseFilter {

    public String filter(String s) {
        StringBuilder sb = new StringBuilder();
        char c;
        boolean b;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            b = Character.isUpperCase(c);
            if (b) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
