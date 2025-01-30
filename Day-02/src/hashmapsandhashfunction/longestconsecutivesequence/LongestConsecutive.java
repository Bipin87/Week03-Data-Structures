package hashmapsandhashfunction.longestconsecutivesequence;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
//    Function to find the longest consecutive sequence
    public static int longestConsecutive(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        Set<Integer> arraySet = new HashSet<>();
        for (int num : array) {
            arraySet.add(num);
        }

        int longestStreak = 0;

        for (int num : arraySet) {
            if (!arraySet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (arraySet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }
}
