package com.capgemini.time_complexity.string_concatenation_performance;

public class StringBuilderPerformance {
    // StringBuilder Method to calculate the execution time and return it
    public static long stringBuilder(String str, int num){
        long startTime=System.nanoTime();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<num;++i){
            sb.append(str);
        }
        return (System.nanoTime() -startTime);
    }
}

