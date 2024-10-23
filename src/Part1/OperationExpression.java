package Part1;

public class OperationExpression implements Expression {
    private final Expression num1;
    private final Expression num2;
    private final String operator;
    public OperationExpression(Expression left, Expression right, String operator) {
        this.num1 = left;
        this.num2 = right;
        this.operator = operator;
    }
    @Override
    public int interpret() {
        return switch (operator) {
            case "+" -> num1.interpret() + num2.interpret();
            case "-" -> num1.interpret() - num2.interpret();
            default -> throw new UnsupportedOperationException("Unknown operator: " + operator);
        };
    }
}
