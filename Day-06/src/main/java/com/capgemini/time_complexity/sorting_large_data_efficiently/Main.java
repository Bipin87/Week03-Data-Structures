package com.capgemini.time_complexity.sorting_large_data_efficiently;


import static com.capgemini.time_complexity.sorting_large_data_efficiently.BubbleSortPerformance.bubbleSort;
import static com.capgemini.time_complexity.sorting_large_data_efficiently.GenerateArray.generateArray;
import static com.capgemini.time_complexity.sorting_large_data_efficiently.MergeSortPerformance.mergeSort;
import static com.capgemini.time_complexity.sorting_large_data_efficiently.QuickSortPerformance.quickSort;

public class Main {
    public static void main(String[] args) {

        int[] array = generateArray(100000);
        // Call Bubble Sort function and display the performance time
        System.out.println("Bubble Sort Performance Time:- " + bubbleSort(array) + " ns");
        int left = 0;
        int right = array.length - 1;

        // Call Bubble Sort function and display the performance time
        System.out.println("Merge Sort Performance Time:- " + mergeSort(array, left, right) + " ns");
        // Function call of Quick sort and display the performance time
        System.out.println("Quick Sort Performance Time:- " +quickSort(array, left, right)+ " ns");
    }
}
