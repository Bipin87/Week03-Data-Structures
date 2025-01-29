package circularlinkedlist.roundrobinscheduling;

public class Main {
    public static void main(String[] args) {
        RoundRobinScheduling roundrobin = new RoundRobinScheduling();

        // Add processes
        roundrobin.addProcess(1, 10, 3);
        roundrobin.addProcess(2, 5, 2);
        roundrobin.addProcess(3, 8, 1);

        // Display the initial process state
        System.out.println("Initial Processes:");
        roundrobin.displayProcesses();

        // Simulate Round Robin Scheduling with a time quantum of 4
        System.out.println();
        System.out.println("Starting Round Robin Scheduling with Time Quantum = 4:");
        roundrobin.simulateRoundRobin(4);
    }
}
