package com.capgemini.time_complexity.sorting_large_data_efficiently;

public class MergeSortPerformance {

    static long startTime = System.nanoTime();

    public static long mergeSort(int [] arr,int left,int right){

        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }


        long endTime = System.nanoTime();
        return endTime -startTime;
    }
    private static void merge(int [] arr, int left,int mid,int right){

        int size1 = mid - left +1;
        int size2 = right - mid;
        int[] leftArray = new int[size1];
        int[] rightArray = new int[size2];

        System.arraycopy(arr,left,leftArray,0,size1);
        System.arraycopy(arr,mid+1,rightArray,0,size2);
        int i = 0, j = 0, k = left;
        while (i < size1 && j < size2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }
        while (i < size1){
            arr[k++] = leftArray[i++];
        }
        while (j < size2){
            arr[k++] = rightArray[j++];
        }


    }
}
