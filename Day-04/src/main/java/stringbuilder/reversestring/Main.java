package stringbuilder.reversestring;

import java.util.Scanner;

import static stringbuilder.reversestring.ReverseString.reversed;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String:- ");
        String string = input.nextLine();
        // Call the method and store the values
        String reverseString = reversed(string);
        // Display the result
        System.out.println("Reversed String is:- "+reverseString);
    }
}
