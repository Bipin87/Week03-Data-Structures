package stacksandqueue.stockspanproblem;

public class Main {
    public static void main(String[] args) {
        int[] prices = {1000, 880, 560, 700, 690, 750};
        int[] span = StockSpanProblem.calculateSpan(prices);

        // Print the span array
        for (int stock : span) {
            System.out.print(stock + " ");
        }
    }
}
