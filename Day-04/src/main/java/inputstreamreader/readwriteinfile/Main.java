package inputstreamreader.readwriteinfile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static inputstreamreader.readwriteinfile.ReadWriteInFile.readFile;
import static inputstreamreader.readwriteinfile.ReadWriteInFile.writeFile;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // Get the file name and the content to add in the file
            System.out.println("Enter the file name: ");
            String fileName = br.readLine();
            System.out.println("Enter the content:- ");
            String content = br.readLine();

            writeFile(fileName, content);

            // Invoke the method to display the file
            readFile(fileName);
        }catch(IOException e){
            System.out.println("Exception Occurred " + e.getMessage());
        }
    }

}
