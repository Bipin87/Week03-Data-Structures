package circularlinkedlist.taskscheduler;
import java.util.Date;
public class Task {
    int taskId;
    String taskName;
    int priority;
    Date dueDate;
    Task next;
    // Constructor
    public Task(int taskId, String taskName, int priority, Date dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}
