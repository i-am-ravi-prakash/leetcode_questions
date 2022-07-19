class Solution {

    public int maxProfit(int[] prices) {
        int len = prices.length;
        int maxProfit = 0;
        int profit = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = len - 1; i >= 0; i--) {
            if (stack.isEmpty() || prices[i] >= stack.peek()) {
                stack.push(prices[i]);
            } else {
                profit = stack.peek() - prices[i];

                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
}
