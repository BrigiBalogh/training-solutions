package week03d05;

public class Operation {

    private int leftOperand;
    private int rightOperand;

    public Operation(String expression) {
        String left = expression.substring(0,expression.indexOf("+"));
        left = left.trim();
        leftOperand = Integer.parseInt(left);


        String right = expression.substring(expression.indexOf("+")+1);
        right = right.trim();
        rightOperand = Integer.parseInt(right);
    }

    // leftOperand = Integer.parseInt(expression.substring()0,indexOf("+"));
    //   rightOperand = Integer.parseInt(expression.substring(expression.indexOf("+")+1);


    public int getResult() {
        return leftOperand + rightOperand;
    }
}