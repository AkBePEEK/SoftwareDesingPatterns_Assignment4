package Part1;

public class OperationExpression implements Expression {
    private final Expression num1;
    private final Expression num2;
    private final char operator;
    public OperationExpression(Expression left, Expression right, char operator) {
        this.num1 = left;
        this.num2 = right;
        this.operator = operator;
    }
    @Override
    public int interpret() {
        if (operator == '+') {
            return num1.interpret() + num2.interpret();
        }
        else if (operator == '-') {
            return num1.interpret() - num2.interpret();
        }
        throw new UnsupportedOperationException("Unknown operator:" + operator);
    }
}
