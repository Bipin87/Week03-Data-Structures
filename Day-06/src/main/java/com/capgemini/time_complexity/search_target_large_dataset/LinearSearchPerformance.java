package com.capgemini.time_complexity.search_target_large_dataset;

public class LinearSearchPerformance {
    //Function to calculate the performance time in Linear Search
    public static long linearSearchPerformance(int[] arr, int target){
        long startTimeLinear = System.nanoTime();

        int i =0;
        while(i < arr.length){
            if(arr[i] == target){

                long endTimeLinear = System.nanoTime();
                return endTimeLinear - startTimeLinear;

            }
            i++;
        }
        long endTimeLinear = System.nanoTime();


        return endTimeLinear - startTimeLinear;
    }
}
