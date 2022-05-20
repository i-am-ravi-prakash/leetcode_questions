class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < len; i++) {
            int currentElement = nums[i];
            if (!map.isEmpty() && map.containsKey(target - currentElement)) {
                result[0] = i;
                result[1] = map.get(target - currentElement);
                break;
            } else {
                map.put(currentElement, i);
            }
        }

        return result;
    }
}
