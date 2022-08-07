class Solution {

    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int uniqueIndex = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < len; i++) {
            if (set.isEmpty() || !set.contains(nums[i])) {
                set.add(nums[i]);
                nums[uniqueIndex++] = nums[i];
            }
        }

        return uniqueIndex;
    }
}
