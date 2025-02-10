package com.capgemini.time_complexity.recursive_iterative_fibonacci_computation;

public class RecursivePerformance {
    // Method to calculate the time in recursive approach
    public static int fibonacciRecursive(int num) {
        if (num <= 1) return num;
        return fibonacciRecursive(num - 1) + fibonacciRecursive(num - 2);
    }
}
