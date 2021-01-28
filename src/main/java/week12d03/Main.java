package week12d03;

public class Main {

    public static void main(String[] args) {
        NumberStat numberStat = new NumberStat();
        numberStat.readFromFile("test.txt");
        System.out.println(numberStat.getNumbers());
    }
}
