package com.capgemini.time_complexity.comparing_different_datastructure_searching;

public class ArrayPerformance {
    public static long searchInArray(int[] arr, int target){
        long start = System.nanoTime();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return (System.nanoTime()-start);
            }
        }
        return (System.nanoTime()-start);
    }
}
