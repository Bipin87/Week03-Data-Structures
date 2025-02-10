package com.capgemini.time_complexity.comparing_different_datastructure_searching;

import java.util.HashSet;

public class HashSetPerformance {
    public static long searchInHashSet(HashSet<Integer> hs, int target){
        long start = System.nanoTime();
        if(hs.contains(target)) return (System.nanoTime()-start);

        return (System.nanoTime()-start);
    }
}
