package com.capgemini.time_complexity.comparing_different_datastructure_searching;

import java.util.TreeSet;

public class TreeSetPerformance {
    public static long searchInTreeSet(TreeSet<Integer> ts, int target){
        long start = System.nanoTime();
        if(ts.contains(target)) return (System.nanoTime()-start);
        return (System.nanoTime()-start);
    }
}
