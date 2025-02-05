package inputstreamreader.convertbytestreamtocharacterstream;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ConversionByteToChar {
    public static void convert(String fileName){
        // Define the file path
        String myPath = "src/main/java/inputstreamreader/convertbytestreamtocharacterstream/" + fileName;

        try (FileInputStream fis = new FileInputStream(myPath);
             InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
             BufferedReader br = new BufferedReader(isr)) {

            System.out.println("Reading file as character stream:");
            System.out.println();

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            System.out.println();

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + myPath);
        } catch (UnsupportedEncodingException e) {
            System.out.println("Error: Unsupported encoding used in the file.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

}
