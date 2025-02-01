package sortingalgorithm.mergesort;

public class BookPrices {
    public static void mergeSort(double[] bookPrices, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            //Recursively divide the array into two halves
            mergeSort(bookPrices, left, mid);
            mergeSort(bookPrices, mid + 1, right);
            //Merge the sorted halves
            merge(bookPrices, left, mid, right);
        }
    }

    private static void merge(double[] bookPrices, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        double[] leftArr = new double[n1];
        double[] rightArr = new double[n2];

        // Copy the array
        System.arraycopy(bookPrices, left, leftArr, 0, n1);
        System.arraycopy(bookPrices, mid + 1, rightArr, 0, n2);
        // Merge the copy arrays back into the main array
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                bookPrices[k++] = leftArr[i++];
            } else {
                bookPrices[k++] = rightArr[j++];
            }
        }
        while (i < n1) bookPrices[k++] = leftArr[i++];
        while (j < n2) bookPrices[k++] = rightArr[j++];
    }



}
