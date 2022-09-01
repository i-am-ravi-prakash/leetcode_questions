class Solution {

    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ansList = new ArrayList<>();
        int equalCount = 0;
        int lessThanCount = 0;

        for (int num : nums) {
            if (num == target) {
                equalCount++;
            } else if (num < target) {
                lessThanCount++;
            }
        }

        for (int i = 0; i < equalCount; i++) {
            ansList.add(lessThanCount++);
        }

        return ansList;
    }
}
