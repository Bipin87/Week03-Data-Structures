package sortingalgorithm.selectionsort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ExamScores scores = new ExamScores();
        double[] examScores = {85.5, 70.2, 90.4, 60.8, 75.3};
        scores.selectionSort(examScores);

        System.out.println("Sorted Exam Scores: ");
        System.out.println(Arrays.toString(examScores));
    }
}
