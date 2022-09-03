class Solution {

    public int maxProfit(int[] prices) {
        int len = prices.length;
        int minPrice = prices[0];
        int profit = 0;
        int maxProfit = 0;

        for (int i = 1; i < len; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            profit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}
