package challengeproblem.comparefilereaderandinputstreamreader;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class CompareFileRAndInputSR {
    public static void compare(String fileName){
        // Storing file path
        String filePath = "src/main/java/challengeproblem/comparefilereaderandinputstreamreader/" + fileName;

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            long count = 0;
            long startTimeFileReader = System.nanoTime();
            while((line = br.readLine()) != null){
                if (!line.equals(" ")) count++;
            }
            long endTimeFileReader = System.nanoTime();
            System.out.println("Total word in a file is: " + count + "\nTime taken by file reader is: " + (endTimeFileReader - startTimeFileReader) + " ns");
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
        // calculating the file input stream time
        try(FileInputStream fs = new FileInputStream(filePath)){
            InputStreamReader isr = new InputStreamReader(fs, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);
            String line;
            long count = 0;
            long startTimeInputStream = System.nanoTime();
            while((line = br.readLine()) != null){
                if (!line.equals(" ")) count++;
            }
            long endTimeInputStream = System.nanoTime();
            System.out.println("Total word in a file is: " + count + "\nTime taken by input stream reader is: " + (endTimeInputStream - startTimeInputStream)+ " ns");
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
