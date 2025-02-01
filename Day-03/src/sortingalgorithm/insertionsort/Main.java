package sortingalgorithm.insertionsort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Creating the object of Employee class
        Employee employee = new Employee();
        System.out.println("Enter the number of employees:- ");
        int numberOfEmployees= input.nextInt();

        int [] employeeIds = new int[numberOfEmployees];
        System.out.println("Enter the Employee Ids:- ");
        for(int i =0; i < numberOfEmployees; i++){

            employeeIds[i]= input.nextInt();
        }
        // Call the method to sort the Employee Ids
        employee.insertionSort(employeeIds);
        // Display the Employee Ids
        System.out.println("After sorting Employee Ids:-");
        System.out.println(Arrays.toString(employeeIds));
    }
}
