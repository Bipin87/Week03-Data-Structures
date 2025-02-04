package stringbuilder.removeduplicatesstring;

import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static stringbuilder.removeduplicatesstring.RemoveDuplicateString.removeDuplicate;

public class TestRemoveDuplicate {
    @Test
    // Junit to test method are proper working or not
    public void test1(){
        assertEquals("acbd", removeDuplicate("acaccabdacb"));
        out.println("Test case 1 pass");

    }

    @Test
    public void test2(){
        assertEquals("acfsid", removeDuplicate("accafasiasd"));
        out.println("Test case 2 pass");
        assertNotEquals("saffd",removeDuplicate("asfscarsf"));

    }
}
