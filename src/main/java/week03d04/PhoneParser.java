package week03d04;

public class PhoneParser {


    public Phone parse(String s) {
        return new Phone(s.substring(0,2),s.substring(3));

    }
}
