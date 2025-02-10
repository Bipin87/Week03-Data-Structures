package com.capgemini.time_complexity.search_target_large_dataset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static com.capgemini.time_complexity.search_target_large_dataset.BinarySearchPerformance.binarySearchPerformance;
import static com.capgemini.time_complexity.search_target_large_dataset.LinearSearchPerformance.linearSearchPerformance;

public class Main {
    // Function to generate large array with random values
    public static int [] generateLargeArray(int size){
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * size);
        }
        return arr;
    }
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] arr = generateLargeArray(1000000);


            System.out.print("Enter the target: ");
            int target = Integer.parseInt(br.readLine());
            // call the linear search function
            long result = linearSearchPerformance(arr,target);
            System.out.println(result);
            Arrays.stream(arr).sorted();
            // call the binary search function
            long res = binarySearchPerformance(arr,target);
            System.out.println(res);
        }
        catch (IOException e){
            System.out.println("Exception caught IO exception" + e.getMessage());
        }
    }
}
