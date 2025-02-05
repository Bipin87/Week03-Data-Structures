package com.capgemini.binary_search.find_rotation_point_rotated_sorted_array;

public class FindRotationPoint {
    // method to find the index of smallest element
    public static int findSmallestElementIndex(int[] arr) {
        // Variable which stores the pointer
        int left = 0, right = arr.length - 1, mid;
        while (left <= right) {
            mid = (left + (right - left)) / 2;
            if (left == right) return left;
            else if (arr[mid] > arr[right]){
                left = mid + 1;
            }
            else if (arr[mid] < arr[left]){
                right = mid;
            }
        }

        return -1;
    }

}
