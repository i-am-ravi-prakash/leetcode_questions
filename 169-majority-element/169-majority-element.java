class Solution {

    public int majorityElement(int[] nums) {
        int len = nums.length;
        int majorityCount = 0;
        int majorElement = nums[0];

        for (int i = 0; i < len; i++) {
            if (majorityCount == 0) {
                majorElement = nums[i];
                majorityCount = 1;
            } else if (nums[i] == majorElement) {
                majorityCount++;
            } else {
                majorityCount--;
            }
        }

        return majorElement;
    }
}
