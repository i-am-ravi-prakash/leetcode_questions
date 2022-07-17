class Solution {

    public int majorityElement(int[] nums) {
        int len = nums.length;
        int count = 0;
        int majorElement = nums[0];

        for (int i = 0; i < len; i++) {
            if (count == 0) {
                majorElement = nums[i];
            }
            if (nums[i] == majorElement) {
                count++;
            } else {
                count--;
            }
        }

        return majorElement;
    }
}
