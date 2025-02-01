package sortingalgorithm.heapsort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        JobApplicants salary = new JobApplicants();
        double[] salaries = {49000, 70000.0, 45000, 60000, 75000};
        salary.heapSort(salaries);

        System.out.println("Sorted the job applicant Salary: ");
        System.out.println(Arrays.toString(salaries));
    }
}
