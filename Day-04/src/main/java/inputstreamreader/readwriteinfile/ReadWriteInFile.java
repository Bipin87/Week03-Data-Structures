package inputstreamreader.readwriteinfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteInFile {
    // Method to read the file
    public static void readFile(String fileName) {
        // Storing the file path
        String myPath = "src/main/java/inputstreamreader/readwriteinfile/" + fileName;
        try {
            BufferedReader br = new BufferedReader(new FileReader(myPath));
            // lineText contains each line in the file
            String lineText;
            while ((lineText = br.readLine()) != null) {
                System.out.println(lineText);
            }
        } catch (IOException e) {  // Handle the io exception occurred by a buffer reader
            System.out.println("Exception occurred " + e.getMessage());
        }
    }

    // Method to write in the file or append in the file
    public static void writeFile(String fileName, String content) {
        String myPath = "src/main/java/inputstreamreader/readwriteinfile/" + fileName;

        // Handle fileWriter and creating object
        try (FileWriter fw = new FileWriter(myPath,true)) {
            fw.write(content + "\n");

        }
        // Handling the exception occurred by FileWriter
        catch (IOException e) {
            System.out.println("Exception occurred " + e.getMessage());
        }
    }
}
