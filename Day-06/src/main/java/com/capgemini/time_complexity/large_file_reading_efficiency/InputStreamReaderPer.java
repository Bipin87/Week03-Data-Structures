package com.capgemini.time_complexity.large_file_reading_efficiency;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class InputStreamReaderPer {
    public static long inputStreamReaderTime(String filepath){
        // Start measuring execution time
        long start = System.nanoTime();
        String myFilePath =  "src/main/java/com/capgemini/time_complexity/large_file_reading_efficiency/" + filepath;

        try(FileInputStream fileInputStream = new FileInputStream(myFilePath);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
            // Open file using BufferedReader for efficiency
            BufferedReader reader = new BufferedReader(inputStreamReader)){
            String line;
            // Read file line by line (processing can be added here)
            while((line = reader.readLine()) != null){}

        }
        catch (FileNotFoundException e){
            System.out.println("Exception occurred file not found "+ e.getMessage());
        }
        catch (IOException e){
            e.printStackTrace();
        }
        // Return elapsed time in milliseconds
        return (System.nanoTime() - start)/1000000;

    }
}
