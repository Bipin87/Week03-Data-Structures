package com.capgemini.time_complexity.string_concatenation_performance;

public class Main {
    public static void main(String[] args) {
        int [] arr={1000,10000,1000000};
        String str="hello";
        for(int num:arr){
            System.out.println();
            // Call String method to calculate the executed time
            long stringTime=StringPerformance.string(str,num);
            System.out.println("Total time taken by String: "+stringTime + " ns");

            // Call StringBuilder method to calculate the executed time
            long stringBuilderTime=StringBuilderPerformance.stringBuilder(str,num);
            System.out.println("Total time taken by StringBuilder: "+stringBuilderTime + " ns");

            // Call StringBuffer method to calculate the executed time
            long stringBufferTime=StringBufferPerformance.stringBuffer(str,num);
            System.out.println("Total time taken by StringBuffer: "+stringBufferTime + " ns");


            System.out.println();


        }
    }
}
