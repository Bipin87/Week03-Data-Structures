package filereader.readafilelinebyline;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static filereader.readafilelinebyline.ReadFile.readFile;

public class Main {
    public static void main(String[] args) {

        /** Try and Catch function to handle the exception
         * Fist Creating the object of buffer reader
         */
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            // User input for existing file name in project
            System.out.print("Enter the File name:-");
            String filename = br.readLine();
            readFile(filename);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
