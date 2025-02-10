package com.capgemini.time_complexity.recursive_iterative_fibonacci_computation;

import org.junit.jupiter.api.Test;

import static com.capgemini.time_complexity.recursive_iterative_fibonacci_computation.DisplayPerformanceTime.displayTimeResult;
import static org.junit.jupiter.api.Assertions.*;

class PerformanceTest {
    @Test
    public void test(){
        assertTrue(displayTimeResult(10));
        assertTrue(displayTimeResult(30));
        assertTrue(displayTimeResult(50));
    }

}