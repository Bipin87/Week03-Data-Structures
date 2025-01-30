package hashmapsandhashfunction.findallsubarrayswithzerosum;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 4, -2, 2, -4, 2, 2};
        List<int[]> zeroSumSubarrays = ZeroSumSubArray.findZeroSumSubarrays(arr);

        for (int[] subarray : zeroSumSubarrays) {
            System.out.println("Subarray found from index " + subarray[0] + " to " + subarray[1]);
        }
    }
}
