class Solution {
    public int pivotIndex(int[] nums) {
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
    }
}