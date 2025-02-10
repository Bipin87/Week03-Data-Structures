package com.capgemini.time_complexity.sorting_large_data_efficiently;

import java.util.Random;

public class GenerateArray {
    public static int [] generateArray(int size){
        Random random= new Random();
        int [] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000);
        }
        return array;
    }
}
