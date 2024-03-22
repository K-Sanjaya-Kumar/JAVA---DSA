package DSA.array;

public class buyandsellstock {
    public static int buyandsellStock(int prices[]) {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        int n = prices.length;
        int profit = 0;

        for (int i = 0; i < n; i++) {
            if (buyprice < prices[i]) {
                profit = prices[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyprice = prices[i];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buyandsellStock(prices));
    }
}
