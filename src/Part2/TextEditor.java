package Part2;

public class TextEditor {
    private String text;

    public TextEditor() {
        this.text = "";
    }

    // Typing text modifies the current state
    public void add(String newText) {
        this.text += newText;
    }

    // Create a memento to save the current state
    public Memento save() {
        return new Memento(text);
    }

    // Restore the editor to a previously saved state
    public void restore(Memento memento) {
        if (memento != null) {
            this.text = memento.getState();  // Restore the saved state
        } else {
            System.out.println("No state to restore!");  // Handle null memento
        }
    }

    // Display the current text
    public String getText() {
        return text;
    }
}
