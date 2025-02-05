package stringbuffer.comparestringbufferwithstringbuilder;

public class StringBufferPerformance {
    //Creating the Concatenate string function for String Buffer
    // Return the performance time of String Buffer
    public static long performanceOfStringBuffer(String [] text, int iteration){

        StringBuffer sb = new StringBuffer();
        // Create the variable that can store start time of StringBuffer
        long start = System.nanoTime();

        for(int i = 0; i < iteration; i++) {
            for (String str : text) {
                sb.append(sb);

            }
        }
        // Create the variable that can store end time
        long end = System.nanoTime();
        // Return the Actual performance time
        return end - start;
    }

}
