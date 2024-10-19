package Part2;

import java.util.Stack;

public class History {
    private final Stack<String> history = new Stack<>();
    public void push(String item) {
        history.push(item);
    }
    public String pop() {
        if (history.isEmpty()) {
            return null;
        }
        return history.pop();
    }
}
