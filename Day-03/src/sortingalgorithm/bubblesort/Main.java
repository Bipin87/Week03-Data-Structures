package sortingalgorithm.bubblesort;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Creating the object of StudentMarks class
        StudentMarks marks = new StudentMarks();
        System.out.println("Enter the number of student:- ");
        int numberOfStudents= input.nextInt();

        int [] studentMarks = new int[numberOfStudents];
        System.out.println("Enter the student Marks:- ");
        for(int i =0; i < numberOfStudents; i++){

            studentMarks[i]= input.nextInt();
        }
        // Call the method to sort the student marks
        marks.bubbleSort(studentMarks);
        // Display the students marks
        System.out.println("After sorting students marks:-");
        System.out.println(Arrays.toString(studentMarks));
    }

}
