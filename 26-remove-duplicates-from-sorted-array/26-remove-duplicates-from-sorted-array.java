class Solution {

    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int lastUniqueIndex = 0;

        for (int i = 1; i < len; i++) {
            if(nums[i] != nums[lastUniqueIndex]){
                nums[++lastUniqueIndex] = nums[i];
            }
        }

        lastUniqueIndex++;
        return lastUniqueIndex;
    }
}
