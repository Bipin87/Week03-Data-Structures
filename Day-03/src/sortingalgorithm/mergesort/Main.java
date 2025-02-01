package sortingalgorithm.mergesort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        BookPrices price = new BookPrices();
        double [] bookPrices = {49.99, 56.0, 99.0, 67.0};
        int left = 0;
        int right = bookPrices.length -1;

        // Call the function
        price.mergeSort(bookPrices, left, right);

        // Display the result
        System.out.println("After sorting Book prices:-");

        System.out.println(Arrays.toString(bookPrices));
    }
}
