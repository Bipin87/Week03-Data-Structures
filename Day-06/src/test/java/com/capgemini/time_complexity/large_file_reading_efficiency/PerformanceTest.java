package com.capgemini.time_complexity.large_file_reading_efficiency;

import org.junit.jupiter.api.Test;

import static com.capgemini.time_complexity.large_file_reading_efficiency.FileReaderPerformance.fileReaderTime;
import static com.capgemini.time_complexity.large_file_reading_efficiency.InputStreamReaderPer.inputStreamReaderTime;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PerformanceTest {
    @Test
    public void test(){
        String [] filePaths ={"text.txt"}; //"example1.txt","example2.txt"
        for(String filePath : filePaths){
            assertTrue(fileReaderTime(filePath) > inputStreamReaderTime(filePath),"fileReader time is greater than input stream reader");
        }
    }

}