package com.capgemini.binary_search.find_peak_element;

import org.junit.jupiter.api.Test;

import static com.capgemini.binary_search.find_peak_element_in_array.PeakElement.peakIndex;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PeakElementTest {
    @Test
    public void test(){
        assertEquals(6,peakIndex(new int[] {6,5,3,1,2} ));
    }
}
