package com.capgemini.time_complexity.string_concatenation_performance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerformanceTest {
    @Test
    public void test(){
        int[] arr = {1000,10000,1000000};
        for(int num : arr){
            String str = "Bipin";
            long stringTime=StringPerformance.string(str,num);
            System.out.println("Total time taken by String: " + stringTime + " ns");

            long stringBuilderTime = StringBuilderPerformance.stringBuilder(str,num);
            System.out.println("Total time taken by StringBuilder: " + stringBuilderTime + " ns");

            long stringBufferTime = StringBufferPerformance.stringBuffer(str,num);
            System.out.println("Total time taken by StringBuffer: " + stringBuilderTime + " ns");

            assertTrue(stringTime > stringBuilderTime);
            assertTrue(stringTime > stringBufferTime);
            assertTrue(stringBufferTime > stringBuilderTime);
            System.out.println();



        }
    }

}