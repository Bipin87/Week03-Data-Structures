package com.capgemini.time_complexity.comparing_different_datastructure_searching;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

import static com.capgemini.time_complexity.comparing_different_datastructure_searching.ArrayPerformance.searchInArray;
import static com.capgemini.time_complexity.comparing_different_datastructure_searching.HashSetPerformance.searchInHashSet;
import static com.capgemini.time_complexity.comparing_different_datastructure_searching.TreeSetPerformance.searchInTreeSet;

public class Main {
    public static void main(String[] args) {
        GenerateArray addRandomElements = new GenerateArray();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size for first Array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        HashSet<Integer> hs = new HashSet<>();
        TreeSet<Integer> ts = new TreeSet<>();

        Random rand = new Random();
        for(int i = 0; i < n; i++){
            int num = rand.nextInt( n * 10);
            arr1[i] = num;
            hs.add(i);
            ts.add(i);
        }

        int target = arr1[rand.nextInt(n)];

        long arrayTime = searchInArray(arr1,target);
        System.out.println("Time taken by Array search: " + arrayTime + " ms");

        // Measure search time in HashSet (O(1))
        long hashSetTime = searchInHashSet(hs,target);
        System.out.println("Time taken by HashSet search: " + hashSetTime + " ns");

        // Measure search time in TreeSet (O(log N))
        long treeSetTime =searchInTreeSet(ts,target);
        System.out.println("Time taken by TreeSet search: " + treeSetTime + " ns");

    }
}
