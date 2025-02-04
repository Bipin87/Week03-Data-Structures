package stringbuilder.removeduplicatesstring;

import java.util.HashSet;

public class RemoveDuplicateString {
    // Method to remove the duplicate character in an String
    public static String removeDuplicate(String string) {
        // Convert all String in lower case
        string.toLowerCase();
        // Creating the string builder object
        StringBuilder sb = new StringBuilder();

        // Creating the HashSet to store a characters of String
        HashSet<Character> characters = new HashSet<>();

        // For loop to check in HashSet characters present or not
        for(char ch :string.toCharArray()){
            if( !characters.contains(ch)){
                // add() method to add character in HashSet
                characters.add(ch);
                sb.append(ch);
            }

        }
        // Return the string
        return sb.toString();
    }
}
