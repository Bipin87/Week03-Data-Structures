package sortingalgorithm.countingsort;

public class StudentAges {
    public static void countingSort(int[] ages, int maxAge) {
        int[] count = new int[maxAge + 1];
        int[] output = new int[ages.length];

        // Count occurrences of each age
        for (int age : ages) {
            count[age]++;
        }

        // Compute cumulative frequencies
        for (int i = 1; i <= maxAge; i++) {
            count[i] += count[i - 1];
        }

        // Place elements in their correct positions
        for (int i = ages.length - 1; i >= 0; i--) {
            output[count[ages[i]] - 1] = ages[i];
            count[ages[i]]--;
        }

        // Copy sorted elements back to original array
        System.arraycopy(output, 0, ages, 0, ages.length);
    }
}
