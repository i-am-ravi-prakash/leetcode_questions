class Solution {

    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ansList = new ArrayList<>();
        int len = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < len; i++) {
            if (nums[i] == target) ansList.add(i);
        }

        return ansList;
    }
}
