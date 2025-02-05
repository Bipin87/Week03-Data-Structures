package filereader.occurrencewordcount;

import org.junit.jupiter.api.Test;

import static filereader.counttheoccurrenceofawordinafile.OccurrenceWordCount.countOccurrenceWord;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestWordCount {
    @Test
    public void test1(){
        assertEquals(4,countOccurrenceWord("OccurrenceWord.txt","in"));
    }
    @Test
    public void test2(){
        assertEquals(3,countOccurrenceWord("OccurrenceWord.txt","a"));
    }
}
