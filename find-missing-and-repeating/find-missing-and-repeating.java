class Solve {
    int[] findTwoElement(int arr[], int len) {
        int[] result = new int[2];
        Arrays.sort(arr);
        
        if(arr[0] != 1){
            result[1] = 1;
        }
        else if(arr[len - 1] != len){
            result[1] = len;
        }
        
        for(int i = 0; i < len - 1; i++){
            if(arr[i] == arr[i + 1]){
                result[0] = arr[i];
            }
            else if(arr[i + 1] - arr[i] != 1){
                result[1] = arr[i] + 1;
            }
        }
        
        return result;
    }
}
