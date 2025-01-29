package doublylinkedlist.undoredofunctionalityfortexteditor;

public class TextEditor {
    private static final int MAX_HISTORY_SIZE = 10;
    private Text head;
    private Text tail;
    private Text current;
    private int size;

    // Constructor to initialize the text editor
    public TextEditor() {
        head = null;
        tail = null;
        current = null;
        size = 0;
    }

    // Method to add a new text state to the history
    public void addTextState(String text) {
        Text newNode = new Text(text);
        if (current != null) {
            current.next = newNode;
            newNode.prev = current;
        }
        current = newNode;
        if (head == null) {
            head = newNode;
        }
        tail = newNode;
        size++;
        // If the history exceeds the maximum size, remove the oldest state
        if (size > MAX_HISTORY_SIZE) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Method to undo the last action and revert to the previous state
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }

    // Method to redo the last undone action and revert to the next state
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }

    // Method to get the current state of the text
    public String getCurrentState() {
        return current != null ? current.text : "";
    }
}

