package com.capgemini.time_complexity.sorting_large_dataset;

import org.junit.jupiter.api.Test;

import static com.capgemini.time_complexity.sorting_large_data_efficiently.BubbleSortPerformance.bubbleSort;
import static com.capgemini.time_complexity.sorting_large_data_efficiently.GenerateArray.generateArray;
import static com.capgemini.time_complexity.sorting_large_data_efficiently.MergeSortPerformance.mergeSort;
import static com.capgemini.time_complexity.sorting_large_data_efficiently.QuickSortPerformance.quickSort;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPerformance {
    @Test
    public void test(){
        int [] arr = generateArray(10000);
        assertTrue(bubbleSort(arr) > quickSort(arr,0,arr.length-1));
        assertTrue(quickSort(arr,0,arr.length-1) > mergeSort(arr,0,arr.length-1));
        assertTrue(bubbleSort(arr) < mergeSort(arr,0,arr.length-1));

    }
}
