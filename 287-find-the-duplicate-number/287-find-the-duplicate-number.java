class Solution {

    public int findDuplicate(int[] nums) {
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            int index = Math.abs(nums[i]);

            if (nums[index] < 0) {
                return index;
            }

            nums[index] = -nums[index];
        }

        return len;
    }
}
