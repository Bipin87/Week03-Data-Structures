package com.capgemini.time_complexity.recursive_iterative_fibonacci_computation;

public class IterativePerformance {
    // Method to calculate the time in iterative approach
    public static int fibonacciIterative(int num) {
        int a = 0;
        int b = 1;
        int sum;
        for (int i = 2; i <= num; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}
