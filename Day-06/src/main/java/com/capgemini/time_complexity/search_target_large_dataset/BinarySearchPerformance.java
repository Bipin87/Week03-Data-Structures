package com.capgemini.time_complexity.search_target_large_dataset;

public class BinarySearchPerformance {

    // Function to calculate the performance time of binary search
    public static long binarySearchPerformance(int[] arr,int target){

        //Store the function starting time
        long startTime = System.nanoTime();
        int left = 0;
        int right = arr.length -1;
        // Perform the searching in datasets
        while(left <= right){
            int mid = ((right - left) + left) / 2;
            if(arr[mid] == target) {
                //Store the end time of function when target find
                long endTime = System.nanoTime();
                // Return the performance time
                return endTime-startTime;
            }
            else if(arr[mid] > target){
                right = mid -1;
            }
            left=mid+1;



        }
        // Store the end time of function
        long endTime = System.nanoTime();

        return endTime - startTime;
    }
}
