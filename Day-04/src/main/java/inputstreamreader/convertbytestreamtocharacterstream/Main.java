package inputstreamreader.convertbytestreamtocharacterstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static inputstreamreader.convertbytestreamtocharacterstream.ConversionByteToChar.convert;

public class Main {
    public static void main(String[] args) {
        // Handle the IO Exception from buffer reader.
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the file name: ");
            // Get the filename from user
            String fileName = br.readLine();
            convert(fileName);
        }catch (IOException e){
            System.out.println("Error occurred " + e.getMessage());
        }
    }
}
