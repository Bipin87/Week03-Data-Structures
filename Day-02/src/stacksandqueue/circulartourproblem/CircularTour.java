package stacksandqueue.circulartourproblem;

import java.util.LinkedList;
import java.util.Queue;
public class CircularTour {
    //Method to find Starting point
    public static int findStartingPoint(PetrolPump[] pumps)
    {
        int size = pumps.length;
        Queue<Integer> queue = new LinkedList<>();
        int start = 0, end = 1;
        int currentPetrol = pumps[start].petrol - pumps[start].distance;
        queue.add(start);
        while (end != start || currentPetrol < 0) {
            while (currentPetrol < 0 && start != end) {
                currentPetrol -= pumps[start].petrol - pumps[start].distance;
                queue.poll();
                start = (start + 1) % size;

                if (start == 0) {
                    return -1;
                }
            }
            currentPetrol += pumps[end].petrol - pumps[end].distance;
            queue.add(end);
            end = (end + 1) % size;
        }
        return start;//Returning the value of starting position
    }
}
