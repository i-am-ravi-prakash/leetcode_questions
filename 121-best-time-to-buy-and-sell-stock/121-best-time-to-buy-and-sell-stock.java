class Solution {

    public int maxProfit(int[] prices) {
        int len = prices.length;
        int maxProfit = 0;
        int profit = 0;
        int minPrice = prices[0];

        for (int i = 1; i < len; i++) {
            int currPrice = prices[i];

            if (currPrice > minPrice) {
                profit = currPrice - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                minPrice = currPrice;
            }
        }

        return maxProfit;
    }
}
