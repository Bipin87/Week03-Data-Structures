package stringbuffer.performancetest;

import org.junit.jupiter.api.Test;
import stringbuffer.comparestringbufferwithstringbuilder.Main;


import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static stringbuffer.comparestringbufferwithstringbuilder.StringBufferPerformance.performanceOfStringBuffer;
import static stringbuffer.comparestringbufferwithstringbuilder.StringBuilderPerformance.performanceOfStringBuilder;

public class TestPerformance {

    @Test
    public void test1(){
        String [] text = {"bipin", "Kumar", " ", "Sahu"};
        int iteration = 2000000;
        assertTrue(performanceOfStringBuilder(text,iteration) < performanceOfStringBuffer(text,iteration), "StringBuilder should be faster than StringBuffer");
        out.println("Test 1 passed");
    }
    @Test
    public void test2(){
        String [] text = {"Om","Tiwari"};
        int iteration = 2000000;
        assertTrue(performanceOfStringBuilder(text,iteration) < performanceOfStringBuffer(text,iteration), "StringBuilder should be faster than StringBuffer");
        out.println("Test 2 passed");
    }

}
