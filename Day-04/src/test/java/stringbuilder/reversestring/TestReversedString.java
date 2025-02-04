package stringbuilder.reversestring;

import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static stringbuilder.reversestring.ReverseString.reversed;

public class TestReversedString {

    @Test
    public void test1(){

        assertEquals("vbsih",reversed("hisbv"));
        out.println("Test 1 is passed");
    }
    @Test
    public void test2(){
        assertNotEquals("scsaa",reversed("bipin"));
        out.println("Test 2 is passed");
    }

}
