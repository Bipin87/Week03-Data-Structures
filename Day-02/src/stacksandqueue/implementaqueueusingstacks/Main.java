package stacksandqueue.implementaqueueusingstacks;

public class Main {
    public static void main(String [] args) {
        QueueUsingStack queue = new QueueUsingStack();

        // Check the queue is empty or not
        System.out.println(queue.isEmpty());

        // Add the element in queue
        queue.enqueue(4);
        queue.enqueue(6);
        queue.enqueue(8);
        queue.enqueue(5);

        // Pop(Dequeue) the element in queue
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        // Return the peek element of queue
        System.out.println(queue.peek());

        System.out.println(queue.isEmpty());


    }

}
