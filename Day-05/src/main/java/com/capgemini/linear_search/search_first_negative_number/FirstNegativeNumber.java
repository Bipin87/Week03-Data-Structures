package com.capgemini.linear_search.search_first_negative_number;

public class FirstNegativeNumber {
    public static int searchFirstNegative(int[] array){
        for(int i = 0;i < array.length; i++){
            if (array[i] < 0) {
                return i;
            }
        }
        return -1;
    }
}
