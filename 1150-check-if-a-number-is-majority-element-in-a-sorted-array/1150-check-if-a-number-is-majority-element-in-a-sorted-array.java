class Solution {
    public boolean isMajorityElement(int[] nums, int target) {
        int len = nums.length;
        int count = 0;
        boolean result = false;
        
        for(int i = 0; i < len; i++){
            if(nums[i] == target){
                count++;
            }
            if(count > (len/2)){
                result = true;
                break;
            }
        }
        return result;
    }
}