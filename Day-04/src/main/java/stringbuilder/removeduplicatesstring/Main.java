package stringbuilder.removeduplicatesstring;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import static stringbuilder.removeduplicatesstring.RemoveDuplicateString.removeDuplicate;


public class Main {
    public static void main(String[] args) {
        try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("Enter the String:- ");
            String string = input.readLine();
            // Call the method and store the values
            String newString = removeDuplicate(string);
            // Display the result
            System.out.println("Reversed String is:- " + newString);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
