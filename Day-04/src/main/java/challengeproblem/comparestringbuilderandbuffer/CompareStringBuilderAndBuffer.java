package challengeproblem.comparestringbuilderandbuffer;

public class CompareStringBuilderAndBuffer {
    // Method to calculate the time taken by string builder and string buffer
    public static void performanceTest(int iteration){
        String str = "hello";

        // String builder object
        StringBuilder sb = new StringBuilder();
        long startTimeBuilder = System.nanoTime();
        for (int i = 0; i < iteration; i++) {
            sb.append(str);
        }

        long endTimeBuilder = System.nanoTime();
        System.out.println("Time taken by string builder is: " + (endTimeBuilder- startTimeBuilder)+ " ns");
        // String buffer object
        StringBuffer sbr = new StringBuffer();
        long startTimeBuffer = System.nanoTime();
        for (int i = 0; i < iteration; i++) {
            sbr.append(str);
        }

        long endTimeBuffer = System.nanoTime();
        System.out.println("Time taken by string buffer is: " + (endTimeBuffer - startTimeBuffer)  + " ns");
    }
}
