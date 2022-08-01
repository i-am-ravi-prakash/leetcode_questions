class Solution {

    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int newArrayLength = 2 * len;
        int[] ans = new int[newArrayLength];

        for (int i = 0; i < newArrayLength; i++) {
            ans[i] = nums[i % len];
        }

        return ans;
    }
}
