class Solution {

    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int sum = 0;
        int maxSum = nums[0];

        for (int i = 0; i < len; i++) {
            sum += nums[i];

            maxSum = Math.max(maxSum, sum);

            if (sum < 0) {
                sum = 0;
            }
        }

        return maxSum;
    }
}
