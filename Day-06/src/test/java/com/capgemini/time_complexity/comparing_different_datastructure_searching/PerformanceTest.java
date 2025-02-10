package com.capgemini.time_complexity.comparing_different_datastructure_searching;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

import static com.capgemini.time_complexity.comparing_different_datastructure_searching.ArrayPerformance.searchInArray;
import static com.capgemini.time_complexity.comparing_different_datastructure_searching.HashSetPerformance.searchInHashSet;
import static com.capgemini.time_complexity.comparing_different_datastructure_searching.TreeSetPerformance.searchInTreeSet;
import static org.junit.jupiter.api.Assertions.*;

class PerformanceTest {
    @Test
    public void test(){
        int num = 1_000_000; // Number of elements
        Random rand = new Random();

        // Generate random data
        int[] arr1 = new int[num];
        HashSet<Integer> hs = new HashSet<>();
        TreeSet<Integer> ts = new TreeSet<>();

        // Add random data in the data structures
        for (int i = 0; i < num; i++) {
            int number = rand.nextInt(num * 10);
            arr1[i] = number;
            hs.add(number);
            ts.add(number);
        }
        // Pick a random element to search
        int target = arr1[rand.nextInt(num)];
        assertTrue(searchInArray(arr1,target) >searchInHashSet(hs,target),"In Array search element time is greater than HashSet searching element time");
        assertTrue(searchInArray(arr1,target) >searchInTreeSet(ts,target),"In Array search element time is greater than TreeSet searching element time");
        assertTrue(searchInHashSet(hs,target) >searchInTreeSet(ts,target),"In HashSet search element time is greater than TreeSet searching element time");

    }

}