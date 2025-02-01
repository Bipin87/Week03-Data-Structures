package sortingalgorithm.quicksort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ProductPrices prices = new ProductPrices();
        double[] productPrices = {99.99, 49.99, 75.50, 120.00, 89.30};
        int low = 0;
        int high = productPrices.length - 1;
        prices.quickSort(productPrices, low, high);

        System.out.println("Sorted Product Prices: ");
        System.out.println(Arrays.toString(productPrices));

    }
}
