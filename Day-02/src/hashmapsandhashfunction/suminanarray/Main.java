package hashmapsandhashfunction.suminanarray;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 23, 5, 9};
        int target = 10;

        if (PairSum.hasPairWithSum(arr, target)) {
            System.out.println("Pair with given sum found.");
        } else {
            System.out.println("No pair with given sum found.");
        }
    }

}
