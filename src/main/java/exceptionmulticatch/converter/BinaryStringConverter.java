package exceptionmulticatch.converter;

public class BinaryStringConverter {

    public boolean[] binaryStringToBooleanArray(String str) {
        if (str == null) {
            throw new NullPointerException(" String is null.");
        }
        boolean[] boo = new boolean[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != '0' && c != '1') {
                throw new IllegalArgumentException("Str is not valid.");
            }
            boo[i] = c == '1';
        }
        return boo;
    }

    public String booleanArrayToBinaryString(boolean[] boo) {
        if (boo == null) {
            throw new NullPointerException("Array is null.");
        }
        if (boo.length == 0) {
            throw new IllegalArgumentException("Boos size is 0.");
        }
        StringBuilder sb = new StringBuilder(boo.length);
        for (int i = 0; i < boo.length; i++) {
            if (boo[i]) {
                sb.append('1');
            } else {
                sb.append('0');
            }
        }
        return sb.toString();
    }
}