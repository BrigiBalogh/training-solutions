package numbers;

import java.util.Scanner;

public class MathOperations {


    public static void main(String[] args) {

        String mathProblem ="4/7+6 /(6- 3)";
        double result =4 /7.0+6.0/(6-3);

        Scanner scanner= new Scanner(System.in);

        System.out.println("Mi az eredmény?(négy tizedes jegy pontossággal)");
        System.out.println(mathProblem );

        double resultByUser = scanner.nextDouble();

        if (Math.abs(result -resultByUser)<0.0001 ) {
            System.out.println("Az eredmény helyes");
        }else {
            System.out.println("Az eredmény helytelen");
        }
    }
}
