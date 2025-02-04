package stringbuilder.reversestring;

public class ReverseString {

    // Method to reverse the String
    public static String reversed(String string){

        // Creating the object of StringBuilder
        StringBuilder sb = new StringBuilder(string);
        String reverseString;
        // Store the reverse String in variables
        reverseString = sb.reverse().toString();
        // Return the reverse string
        return reverseString;

    }

}
