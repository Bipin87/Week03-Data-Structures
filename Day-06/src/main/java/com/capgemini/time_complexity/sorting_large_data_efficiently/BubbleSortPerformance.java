package com.capgemini.time_complexity.sorting_large_data_efficiently;

public class BubbleSortPerformance {
    public static long bubbleSort(int [] array){
        long start = System.nanoTime();
        boolean swap = false;
        for(int i =0;  i < array.length - 1; i++){

            for(int j=0; j < array.length - i -1; j++){
                if(array[j] > array[j+1]){
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swap = true;

                }

            }
            if(!swap){
                break;
            }

        }
        long end = System.nanoTime();
        return end - start;
    }
}
