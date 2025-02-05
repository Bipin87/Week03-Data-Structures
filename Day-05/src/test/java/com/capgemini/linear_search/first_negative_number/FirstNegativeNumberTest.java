package com.capgemini.linear_search.first_negative_number;

import org.junit.jupiter.api.Test;

import static com.capgemini.linear_search.search_first_negative_number.FirstNegativeNumber.searchFirstNegative;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstNegativeNumberTest {
    @Test
    public void testOne(){
        assertEquals(2,searchFirstNegative(new int[] {2,3,-1,6,5}));
    }
    @Test
    public void testSecond(){
        assertEquals(4,searchFirstNegative(new int[] {2,3,1,6,-2}));
    }
}
