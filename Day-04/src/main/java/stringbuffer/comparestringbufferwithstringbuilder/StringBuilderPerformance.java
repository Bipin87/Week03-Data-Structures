package stringbuffer.comparestringbufferwithstringbuilder;

public class StringBuilderPerformance {


    //Creating the Concatenate string function for String Builder
    public static long performanceOfStringBuilder(String []text,int iteration) {
        // Creating object of StringBuilder
        StringBuilder sbr = new StringBuilder();
        // Create the variable that can store start time of String Builder
        long startTime = System.nanoTime();



        for(int i = 0; i < iteration; i++) {
            for (String str : text) {
                // Concatenate the string in object using method
                sbr.append(str);

            }
        }
        // Create the variable that can store end time of StringBuilder
        long endTime = System.nanoTime();
        // Return the Actual performance time
        return endTime - startTime;
    }
}
