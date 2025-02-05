package com.capgemini.binary_search.find_rotation_point_rotated_sorted_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.capgemini.binary_search.find_rotation_point_rotated_sorted_array.FindRotationPoint.findSmallestElementIndex;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // Get the size of the array from the user
            System.out.println("Enter the length of the array: ");
            int n = Integer.parseInt(br.readLine());

            // Array  for storing the elements
            int[] arr = new int[n];
            System.out.println("Enter the array elements: ");
            try{
                for (int i = 0; i < n; i++) {
                    arr[i] = Integer.parseInt(br.readLine());
                }

            }catch (NumberFormatException e){
                System.out.println("Number format exception occurred please enter the number one by one (Enter the number and press enter then repeat the process)\n" + e.getMessage());
            }
            // Invoke the method which return the index of smallest elements
            int smallestElementindex = findSmallestElementIndex(arr);
            // Display the index
            System.out.println("Smallest element index is: "+smallestElementindex + "\n Smallest element is: " +arr[smallestElementindex] );
        }catch (IOException e){
            System.out.println("Exception caught IO Exception " + e.getMessage());
        }
    }
}
