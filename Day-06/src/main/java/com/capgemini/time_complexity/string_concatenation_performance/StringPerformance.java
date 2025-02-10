package com.capgemini.time_complexity.string_concatenation_performance;

public class StringPerformance {

    // String Method to calculate the execution time and return it

    public static long string(String str, int num){
         long startTime=System.nanoTime();
         String temp="";
         for(int i=0;i<num;++i){
             temp += str;
         }
         return (System.nanoTime() -startTime);
     }
}
