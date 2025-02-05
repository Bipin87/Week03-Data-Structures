package filereader.readafilelinebyline;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    // Function to read the file
    public static void readFile(String fileName) {

        String myPath = "src/main/java/filereader/readafilelinebyline/"+ fileName;
        try (BufferedReader br = new BufferedReader(new FileReader(myPath))) {
            String i;
            while ((i = br.readLine()) != null) {
                // Reads and prints the file line by line
                System.out.println(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

