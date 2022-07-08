class Solution {

    public void nextPermutation(int[] nums) {
        /*
            #algorithm
            1. traverse the array from end and find the index X where arr[X] < arr[X+1]
            2. traverse again from end to index X find index Y such that arr[Y] > arr[X]
            3. swap arr[X] and arr[Y]
            4. reverse array from index (len-1) to (X+1)
        */

        int len = nums.length;
        int X = 0;
        int Y = 0;
        boolean largestNum = true;

        //step 1:
        for (int i = len - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                X = i - 1;
                largestNum = false;
                break;
            }
        }

        if (largestNum == true) {
            reverseArr(nums, 0, len - 1);
            return;
        }

        //step 2:
        for (int i = len - 1; i > X; i--) {
            if (nums[i] > nums[X]) {
                Y = i;
                break;
            }
        }

        swap(nums, X, Y);

        reverseArr(nums, X + 1, len - 1);
    }

    public void reverseArr(int[] arr, int start, int end) {
        while (start <= end) {
            swap(arr, start++, end--);
        }
    }

    public void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
