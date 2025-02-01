package sortingalgorithm.selectionsort;

public class ExamScores {
    public static void selectionSort(double[] examScores) {
        int n = examScores.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (examScores[j] < examScores[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            double temp = examScores[minIndex];
            examScores[minIndex] = examScores[i];
            examScores[i] = temp;
        }
    }


}
