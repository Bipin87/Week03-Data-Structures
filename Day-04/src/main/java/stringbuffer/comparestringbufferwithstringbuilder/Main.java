package stringbuffer.comparestringbufferwithstringbuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static stringbuffer.comparestringbufferwithstringbuilder.StringBuilderPerformance.performanceOfStringBuilder;
import static stringbuffer.comparestringbufferwithstringbuilder.StringBufferPerformance.performanceOfStringBuffer;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("Enter the String Array size: -");
            int size = Integer.parseInt(br.readLine());
            String [] text = new String[size];
            for(int i =0; i < text.length; i++){
                System.out.print("Enter the string:-");
                text[i] = br.readLine();
            }
            int iteration = 1000000;
            // Call the functions
            long stringBuilderTime = performanceOfStringBuilder(text,iteration);
            long stringBufferTime = performanceOfStringBuffer(text,iteration);

            // Display performance times
            System.out.println("Total time of StringBuilder is: " + stringBuilderTime + " ns");
            System.out.println("Total time of StringBuffer is: " + stringBufferTime + " ns");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
