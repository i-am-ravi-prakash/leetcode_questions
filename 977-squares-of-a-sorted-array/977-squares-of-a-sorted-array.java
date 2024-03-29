class Solution {

    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int start = 0;
        int end = len - 1;
        int[] result = new int[len];

        for (int i = len - 1; i >= 0; i--) {
            if (Math.abs(nums[start]) > Math.abs(nums[end])) {
                result[i] = nums[start] * nums[start];
                start++;
            } else {
                result[i] = nums[end] * nums[end];
                end--;
            }
        }

        return result;
    }
}
