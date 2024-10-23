package Part2;

import java.util.Stack;

public class History {
    private final Stack<Memento> history = new Stack<>();
    public void saveState(Memento item) {
        history.push(item);
    }
    public Memento undo() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return null;
    }
}
