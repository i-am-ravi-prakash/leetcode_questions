class Solution {

    public int[] twoSum(int[] arr, int target) {
        int len = arr.length;
        int start = 0;
        int end = len - 1;
        int[] result = new int[2];

        while (start < end) {
            if (arr[start] + arr[end] == target) {
                result[0] = start + 1;
                result[1] = end + 1;
                break;
            } else if (arr[start] + arr[end] > target) {
                end--;
            } else {
                start++;
            }
        }

        return result;
    }
}
