package Part2;

public class TextEditor {
    private String text = "";
    public TextEditor(String text) {
        this.text += text;
    }
    public String getText() {
        return text;
    }
    public Memento createMemento() {
        return new Memento(text);
    }
    public void restoreMemento(Memento memento) {
        text = memento.getState();
    }
}
