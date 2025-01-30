package stacksandqueue.sortastackusingrecursion;
import java.util.Stack;


public class SortStack {
    private Stack<Integer> stack;
    //Constructor
    public SortStack()
    {
        stack = new Stack<>();
    }
    //Function to push the data onto the stack
    void push(int data)
    {
        stack.push(data);
    }
    //Function to sort the stack
    public void sortStack()
    {
        if (stack.isEmpty())
        {
            return;
        }
        int temp = stack.pop();
        sortStack();
        insertSorted(temp);
    }

    // Function to insert an element in a sorted stack
    private  void insertSorted(int element) {
        if (stack.isEmpty() || element > stack.peek())
        {
            stack.push(element);
        } else
        {
            int temp = stack.pop();
            insertSorted(element);
            stack.push(temp);
        }
    }
    //Function to display the stack
    public void display()
    {
        System.out.println("Sorted stack is "+ stack);

    }


}