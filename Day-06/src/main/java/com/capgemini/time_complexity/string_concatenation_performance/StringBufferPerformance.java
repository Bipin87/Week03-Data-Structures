package com.capgemini.time_complexity.string_concatenation_performance;

public class StringBufferPerformance {

    // StringBuffer Method to calculate the execution time and return it
    public static long stringBuffer(String str,int num){
        long startTime=System.nanoTime();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<num;++i){
            sb.append(str);
        }
        return (System.nanoTime() -startTime);
    }
}
