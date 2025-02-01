package sortingalgorithm.countingsort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StudentAges studentAges = new StudentAges();
        int[] ages = {12, 14, 10, 18, 15, 16, 12, 14, 13};
        int maxAge = 18;
        studentAges.countingSort(ages, maxAge);

        System.out.println("After sorting student ages: ");
        System.out.println(Arrays.toString(ages));

    }
}
