package stringbuffer.concatenatestrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static stringbuffer.concatenatestrings.ConcatenateString.stringConcatenate;

public class Main {
    public static void main(String[] args) {
        // Try and catch method to handle the exception occurs
        // Creating the BufferReader object for user inputs
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("Enter the String array size:- ");
            int size = Integer.parseInt(br.readLine());
            String [] text= new String[size];
            for(int i = 0; i< size; i++){
                System.out.print("Enter the string text: ");
                text[i] = br.readLine();
            }
            // Call the function and store it's value
            String newString = stringConcatenate(text);

            // display the result
            System.out.println("Concatenate string is: " + newString);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
