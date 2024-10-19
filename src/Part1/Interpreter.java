package Part1;

import java.util.Stack;

public class Interpreter {
    public static int eval(String input) {
        Stack<Expression> stack = new Stack<>();
        String[] tokens = input.split(" ");
        for (String token : tokens) {
            if (isNumber(token)) {
                stack.push(new NumberExpression(Integer.parseInt(token)));
            }
            else if (token.equals("+") || token.equals("-")){
                Expression exp1 = stack.pop();
                Expression exp2 = stack.pop();
                stack.push(new OperationExpression(exp1, exp2, token.charAt(0)));
            }
        }
        return stack.pop().interpret();
    }
    public static boolean isNumber(String str) {
        try {
            Double.parseDouble(str);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
}
