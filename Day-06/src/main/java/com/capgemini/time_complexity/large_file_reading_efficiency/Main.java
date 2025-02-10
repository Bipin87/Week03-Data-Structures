package com.capgemini.time_complexity.large_file_reading_efficiency;

import static com.capgemini.time_complexity.large_file_reading_efficiency.FileReaderPerformance.fileReaderTime;
import static com.capgemini.time_complexity.large_file_reading_efficiency.InputStreamReaderPer.inputStreamReaderTime;

public class Main {
    public static void main(String[] args) {
        String []files ={"text.txt"};//,"example1.txt","example2.txt"
        for(String filePath : files) {
            long fileTime = fileReaderTime(filePath);

            long inputTime = inputStreamReaderTime(filePath);

            System.out.println("Time Taken by File Reader: " + fileTime + " ms");
            System.out.println("Time Taken by Input Stream Reader: " + inputTime + " ms");
            System.out.println();
        }
    }
}
