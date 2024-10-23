package Part1;

public class Interpreter {
    public static int eval(String expression) {
        String[] tokens = expression.split(" ");

        Expression left = null;  // Keep track of the left expression (progressive result)

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];

            if (isNumber(token)) {
                // Convert the string number into a NumberExpression
                NumberExpression number = new NumberExpression(Integer.parseInt(token));

                // If this is the first token, initialize the 'left' expression with the first number
                if (left == null) {
                    left = number;
                } else {
                    // Apply the operation if we've already encountered a left expression
                    String operator = tokens[i - 1]; // Operator is the previous token
                    left = new OperationExpression(left, number, operator);
                }
            }
        }

        // The final left expression should now contain the evaluated result
        return left != null ? left.interpret() : 0;  // Return the result
    }
    public static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
}
