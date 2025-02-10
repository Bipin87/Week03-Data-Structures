package com.capgemini.time_complexity.large_file_reading_efficiency;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReaderPerformance {
    public static long fileReaderTime(String filePath){
        // Start measuring execution time
        long startTime = System.nanoTime();
        String myFilePath =  "src/main/java/com/capgemini/time_complexity/large_file_reading_efficiency/" + filePath;
        try(java.io.FileReader fileReader = new java.io.FileReader(myFilePath);
            // Open file using BufferedReader for efficiency
            BufferedReader reader = new BufferedReader(fileReader)){
            String line;
            // Read file line by line (processing can be added here)
            while((line = reader.readLine()) != null){

            }

        }
        catch (FileNotFoundException e){
            System.out.println("Exception occurred file not found "+ e.getMessage());
        }
        catch(IOException e){
            e.printStackTrace();
        }
        // Return elapsed time in milliseconds
        return (System.nanoTime() - startTime)/1000000;
    }
}
