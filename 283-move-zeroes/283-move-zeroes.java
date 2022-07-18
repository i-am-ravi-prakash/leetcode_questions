class Solution {

    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int snowball = 0;

        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) {
                snowball++;
            } else if (snowball > 0) {
                int temp = nums[i];
                nums[i] = 0;
                nums[i - snowball] = temp;
            }
        }
    }
}
