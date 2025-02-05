package stringbuffer.concatenatestring;

import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static stringbuffer.concatenatestrings.ConcatenateString.stringConcatenate;

public class TestString {
    @Test
    public void testFunction1(){
        // Test the function work properly or not
        String [] text = {"Bipin"," ", "Kumar", " ", "Sahu"};
        assertEquals("Bipin Kumar Sahu",stringConcatenate(text));
        out.println("Test 1 passed");
    }
    @Test
    void testFunction2(){
        String [] string = {"Durgesh"," ","Kushwaha"};
        assertNotEquals("DurgeshKushwaha", stringConcatenate(string));
        out.println("Test 2 passed");
    }

}
