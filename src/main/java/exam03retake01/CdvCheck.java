package exam03retake01;

public class CdvCheck {

    private static final int LENGTH = 10;


    public boolean check(String s) {

        if (s.length() != LENGTH || notNumber(s)) {
            throw new IllegalArgumentException("The number is wrong .");
        }

      int sum = 0;
      int count = 0;
      int number = 0;
        for(int i=0; i<LENGTH-1;i++) {
            count ++;
            number =s.charAt(i) - '0';
            Integer b = count*number;
            sum += b;
        }
        return sum % 11 == s.charAt(9) - '0';
    }


    private boolean notNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                return true;
            }
        }
        return false;
    }
}
