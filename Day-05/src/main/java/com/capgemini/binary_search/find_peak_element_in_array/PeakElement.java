package com.capgemini.binary_search.find_peak_element_in_array;

public class PeakElement {
    public static int peakIndex(int[] arr) {
        // Handle empty array case
        if (arr == null || arr.length == 0) {
            return -1;
        }
        // Single element is the peak
        if (arr.length == 1) {
            return 0;
        }

        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
