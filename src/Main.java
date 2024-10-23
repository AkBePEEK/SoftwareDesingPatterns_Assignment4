import Part1.*;
import Part2.*;
import Part3.*;

public class Main {
    public static void main(String[] args) {
       String expression = "5 + 2 - 3";
        System.out.println("Answer: " + Interpreter.eval(expression));

        TextEditor editor = new TextEditor();
        History history = new History();

        editor.add("Hello");
        history.saveState(editor.save());  // Save state "Hello"

        editor.add(", World!");
        history.saveState(editor.save());  // Save state "Hello, World!"

        System.out.println("Current Text: " + editor.getText());  // Output: Hello, World!

        // Undo last operation
        editor.restore(history.undo());
        System.out.println("After Undo: " + editor.getText());  // Output: Hello

        // Undo another operation
        editor.restore(history.undo());
        System.out.println("After Another Undo: " + editor.getText());

        NewsAgency agency = new NewsAgency();

        // Create multiple NewsChannels (Observers)
        NewsChannel cnn = new NewsChannel("CNN");
        NewsChannel bbc = new NewsChannel("BBC");
        NewsChannel fox = new NewsChannel("Fox News");

        // Register the NewsChannels with the NewsAgency
        agency.addObserver(cnn);
        agency.addObserver(bbc);
        agency.addObserver(fox);

        // Set a new headline, all channels will be notified
        agency.setNewsAgency("New breakthrough in AI technology!");

        // Remove one observer and update the headline again
        agency.removeObserver(fox);
        agency.setNewsAgency("Stock markets hit an all-time high!");

    }
}