package stringbuffer.concatenatestrings;

public class ConcatenateString {
    //Creating the Concatenate string method
    public static String stringConcatenate(String []text){
        // Creating object of StringBuffer
        StringBuffer sb = new StringBuffer();
        for (String str : text) {
            // Concatenate the string in object using method
            sb.append(str);
        }
        // Return the new String
        return sb.toString();
    }
}
