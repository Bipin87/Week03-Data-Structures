package com.capgemini.binary_search.find_first_last_occurrence_element_sorted_array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.capgemini.binary_search.find_first_last_occurrence_element_array.FirstAndLastOccurrenceElement.findFirstAndLastOccurrence;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FirstLastOccurrenceTest {
    @Test
    void findOccurrenceOne(){
        int[] result = findFirstAndLastOccurrence(new int[] {1,2,2,2,3,4,5,6},2);
        assertEquals(Arrays.toString(new int[] {1,3}), Arrays.toString(result));
    }
}
