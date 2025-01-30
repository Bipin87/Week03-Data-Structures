package hashmapsandhashfunction.twosumproblem;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
//    Function to find the two sum equal target, return index
    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        // If no valid pair is found
        return new int[]{-1, -1};

    }
}
