class Solution {
    public int missingNumber(int[] arr) {
        int missingNum = -1;
        int len = arr.length;
        Arrays.sort(arr);
        
        if(arr[len - 1] != len){
            return len;
        }
        else if(arr[0] != 0){
            return 0;
        }
        
        for(int i = 0; i < len - 1; i++){
            if(arr[i + 1] - arr[i] != 1){
                missingNum = arr[i] + 1;
                break;
            }
        }
        
        return missingNum;
    }
}