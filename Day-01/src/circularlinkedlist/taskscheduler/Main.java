package circularlinkedlist.taskscheduler;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        // Creating circular linked list object
        TaskScheduler task = new TaskScheduler();
        task.addTaskAtEnd(1, "Task 1", 1, new Date());
        task.addTaskAtEnd(2, "Task 2", 2, new Date());
        task.addTaskAtEnd(3, "Task 3", 3, new Date());
        task.addTaskAtEnd(4, "Task 4", 4, new Date());
        task.addTaskAtEnd(5, "Task 5", 5, new Date());

        // Displaying all tasks
        task.displayAllTasks();

        // Searching task by priority
        System.out.println("Current Task: " + task.viewCurrentTask().taskName);

        // Moving to next task
        task.moveToNextTask();

        // Displaying current task
        System.out.println("Current Task: " + task.viewCurrentTask().taskName);

        // Moving to next task
        task.moveToNextTask();

        // Displaying current task
        System.out.println("Current Task: " + task.viewCurrentTask().taskName);

        // Moving to next task
        task.moveToNextTask();

        // Displaying current task
        System.out.println("Current Task: " + task.viewCurrentTask().taskName);

        // Moving to next task
        task.moveToNextTask();

        // Displaying current task
        System.out.println("Current Task: " + task.viewCurrentTask().taskName);
    }
}
