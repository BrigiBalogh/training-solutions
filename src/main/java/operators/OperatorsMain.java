package operators;

public class OperatorsMain {

    public static void main(String[] args) {
        Operators operators = new Operators();
        System.out.println(operators.isEven(1));
        System.out.println(operators.isEven(2));

        System.out.println(Integer.toBinaryString(200));

        System.out.println(16>>1);
        System.out.println(16<<1);
        System.out.println(13>>1);
        System.out.println(13<<1);

        System.out.println(operators.multiplyByPowerOfTwo(4,6));

        operators.cannotConvert();
        operators.convert();
    }
}
