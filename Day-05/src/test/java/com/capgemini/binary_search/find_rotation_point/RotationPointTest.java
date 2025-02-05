package com.capgemini.binary_search.find_rotation_point;

import org.junit.jupiter.api.Test;

import static com.capgemini.binary_search.find_rotation_point_rotated_sorted_array.FindRotationPoint.findSmallestElementIndex;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RotationPointTest {
    @Test
    public void testOne(){
        assertEquals(2,findSmallestElementIndex(new int[] {4,5,1,2,3}));

    }
}
