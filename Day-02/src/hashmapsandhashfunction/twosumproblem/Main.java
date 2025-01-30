package hashmapsandhashfunction.twosumproblem;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 4, 11, 3};
        int target = 7;
        int[] result = TwoSum.findTwoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
