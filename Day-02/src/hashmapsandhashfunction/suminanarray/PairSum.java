package hashmapsandhashfunction.suminanarray;
import java.util.HashMap;

public class PairSum {
    public static boolean hasPairWithSum(int[] array, int target) {
        HashMap<Integer, Boolean> visitedNumbers = new HashMap<>();

        for (int data : array) {
            int complement = target - data;
            if (visitedNumbers.containsKey(complement)) {
                return true;
            }
            visitedNumbers.put(data, true);
        }

        return false;
    }
}
