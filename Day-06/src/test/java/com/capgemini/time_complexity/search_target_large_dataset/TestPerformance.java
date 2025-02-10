package com.capgemini.time_complexity.search_target_large_dataset;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.capgemini.time_complexity.search_target_large_dataset.BinarySearchPerformance.binarySearchPerformance;
import static com.capgemini.time_complexity.search_target_large_dataset.LinearSearchPerformance.linearSearchPerformance;
import static com.capgemini.time_complexity.search_target_large_dataset.Main.generateLargeArray;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPerformance {

    @Test
    public void testFunction() {
        int[] array = generateLargeArray(100000000);
        Arrays.sort(array);
        int target = 3295;

        long linearTime = linearSearchPerformance(array, target);
        long binaryTime = binarySearchPerformance(array, target);

        System.out.println("Linear Search Time: " + linearTime + " ns");
        System.out.println("Binary Search Time: " + binaryTime + " ns");

        assertTrue(linearTime > binaryTime, "Binary search should be faster");
    }
}
