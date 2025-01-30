package stacksandqueue.sortastackusingrecursion;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        SortStack q1= new SortStack();

        //Adding the elements in Stack
        q1.push(7);
        q1.push(3);
        q1.push(1);
        q1.push(5);
        q1.push(6);

        // Sort the stack using method
        q1.sortStack();

        // Display the stack
        q1.display();
    }
}
