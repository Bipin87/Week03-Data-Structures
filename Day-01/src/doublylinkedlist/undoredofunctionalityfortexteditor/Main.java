package doublylinkedlist.undoredofunctionalityfortexteditor;

public class Main {
    public static void main(String[] args)
    {
        TextEditor editor = new TextEditor();

        // Add some text states
        editor.addTextState("Abhinav");
        editor.addTextState("Abhinav 2");
        editor.addTextState("Abhinav 3");

        // Print the current state
        System.out.println("Current State: " + editor.getCurrentState());

        // Undo the last action
        editor.undo();

        // Print the current state after undo
        System.out.println("Current State after undo: " + editor.getCurrentState());

        // Redo the last undone action
        editor.redo();

        // Print the current state after redo
        System.out.println("Current State after redo: " + editor.getCurrentState());
    }
}
