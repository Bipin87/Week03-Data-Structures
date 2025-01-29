package circularlinkedlist.roundrobinscheduling;

class Priority {

    //create attributes
    int processID;
    int burstTime;
    int priority;
    Priority next;

    public Priority(int processID, int burstTime, int priority){
        this.processID = processID;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}
