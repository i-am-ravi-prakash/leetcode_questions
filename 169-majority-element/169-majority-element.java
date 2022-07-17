class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        
        for(int i = 0; i < len; i++){
            int currElement = nums[i];
            if(!map.containsKey(currElement)){
                map.put(currElement, 1);
            }
            else{
                map.put(currElement, (map.get(currElement) + 1));
            }
        }
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > (len / 2)){
                result = entry.getKey();
                break;
            }
        }
        
        return result;
    }
}