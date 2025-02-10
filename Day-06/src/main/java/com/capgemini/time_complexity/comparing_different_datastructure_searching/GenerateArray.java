package com.capgemini.time_complexity.comparing_different_datastructure_searching;

import java.util.Random;

public class GenerateArray {
    Random rand = new Random();
    GenerateArray(){
        this.rand=rand;
    }
    public int[] generateRandomElement(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(90);
        }
        return arr;
    }
}
