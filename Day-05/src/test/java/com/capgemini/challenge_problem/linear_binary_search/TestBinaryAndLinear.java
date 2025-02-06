package com.capgemini.challenge_problem.linear_binary_search;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static com.capgemini.challenge_problem.linear_and_binary_search.LinearAndBinarySearch.searchFirstMissingPositive;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBinaryAndLinear {
    @Test
    void linearSearchTest(){
        assertEquals(2,searchFirstMissingPositive(new ArrayList<>(Arrays.asList(1,3,4,5,6))));
    }

}
