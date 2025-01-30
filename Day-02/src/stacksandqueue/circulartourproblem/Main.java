package stacksandqueue.circulartourproblem;

public class Main {
    public static void main(String[] args) {
        //Created the object of Petrol Pump and putted the value also
        PetrolPump[] pumps = {
                new PetrolPump(4, 6),
                new PetrolPump(6, 5),
                new PetrolPump(7, 3),
                new PetrolPump(4, 5)
        };
        //calling the starting point to find method
        int start = CircularTour.findStartingPoint(pumps);

        if (start == -1) {
            System.out.println("No solution");
        } else {
            System.out.println("Start = " + start);
        }
    }
}
