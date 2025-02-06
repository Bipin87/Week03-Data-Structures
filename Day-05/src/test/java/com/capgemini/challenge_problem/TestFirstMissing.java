package com.capgemini.challenge_problem;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static com.capgemini.challenge_problem.linear_search_first_missing_positive_integer.FirstMissPosInteger.searchFirstMissingPositive;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFirstMissing {
    @Test
    void linearSearchTest(){
        assertEquals(2,searchFirstMissingPositive(new ArrayList<>(Arrays.asList(1,3,4,5,6))));
    }

}
