package sortingalgorithm.quicksort;

public class ProductPrices {
    public static void quickSort(double[] productPrices, int low, int high) {
        if (low < high) {
            int pi = partition(productPrices, low, high);

            // Recursively sort elements before and after partition
            quickSort(productPrices, low, pi - 1);
            quickSort(productPrices, pi + 1, high);
        }
    }

    private static int partition(double[] productPrices, int low, int high) {
        double pivot = productPrices[high]; // Choosing last element as pivot
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (productPrices[j] <= pivot) {
                i++;
                double temp = productPrices[i];
                productPrices[i] = productPrices[j];
                productPrices[j] = temp;
            }
        }

        double temp = productPrices[i + 1];
        productPrices[i + 1] = productPrices[high];
        productPrices[high] = temp;

        return i + 1;
    }
}
