class Solution {

    public int pivotIndex(int[] nums) {
        /**
        int len = nums.length;
        int leftSum = 0;
        int totalSum = 0;
        int pivotIndex = -1;
        
        for(int i = 0; i < len; i++){
            totalSum += nums[i];
        }
        
        int rightSum = totalSum - nums[0];
        if(leftSum == rightSum){
            return pivotIndex = 0;
        }
        
        for(int i = 1; i < len; i++){
            leftSum += nums[i - 1];
            rightSum = totalSum - leftSum - nums[i];
            if(leftSum == rightSum){
                pivotIndex = i;
                break;
            }
        }
        
        return pivotIndex;
        */
        int totalSum = 0;
        int sum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        for (int i = 0; i < nums.length; sum += nums[i++]) {
            if (sum * 2 == totalSum - nums[i]) {
                return i;
            }
            //sum += nums[i];
        }
        return -1;
    }
}
