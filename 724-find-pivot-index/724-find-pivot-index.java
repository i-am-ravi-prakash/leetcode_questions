class Solution {

    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;
        int pivotIndex = -1;

        for (int num : nums) {
            totalSum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            if (leftSum * 2 == totalSum - nums[i]) {
                pivotIndex = i;
                break;
            }
            leftSum += nums[i];
        }
        return pivotIndex;
    }
}
