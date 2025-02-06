package com.capgemini.binary_search.search_target_value;

import org.junit.jupiter.api.Test;

import static com.capgemini.binary_search.search_target_value_in_2dmatrix.TargetValue.searchIndex;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TargetValueTest {
    @Test
    public void test(){
        assertTrue(searchIndex(new int[][] {{1,2},{3,4}},2));
    }
}
