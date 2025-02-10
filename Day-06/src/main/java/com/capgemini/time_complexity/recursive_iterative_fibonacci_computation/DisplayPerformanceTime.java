package com.capgemini.time_complexity.recursive_iterative_fibonacci_computation;

import static com.capgemini.time_complexity.recursive_iterative_fibonacci_computation.IterativePerformance.fibonacciIterative;
import static com.capgemini.time_complexity.recursive_iterative_fibonacci_computation.RecursivePerformance.fibonacciRecursive;

public class DisplayPerformanceTime {
    //Calculate the execution time and return boolean
    public static boolean displayTimeResult(int num){
        long startOfRecursion = System.nanoTime();
        int result1 = fibonacciRecursive(num);
        long endOfRecursion = System.nanoTime();


        long startOfIterative = System.nanoTime();
        int result2 = fibonacciIterative(num);
        long endOfIterative = System.nanoTime();

        long timeByRecursion = endOfRecursion-startOfRecursion;
        long timeByIteration = endOfIterative-startOfIterative;

        System.out.println("Time taken by the recursive function: "+timeByRecursion +" ns");
        System.out.println("Time taken by the iterative function: "+ timeByIteration +" ns");
        System.out.println();

        return timeByRecursion >= timeByIteration;
    }
}
