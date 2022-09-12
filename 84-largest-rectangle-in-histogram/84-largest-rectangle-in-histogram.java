class Solution {
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        Stack<Integer> stack = new Stack<Integer>();
        int[] nslArray = new int[len];
        int[] nsrArray = new int[len];
        int[] areaArray = new int[len];
        int maxArea = Integer.MIN_VALUE;

        nslArray = nextSmallerInLeft(heights);
        nsrArray = nextSmallerInRight(heights);

        for(int i = 0; i < len; i++){
        	areaArray[i] = (nsrArray[i] - nslArray[i] - 1) * heights[i];
        	if(areaArray[i] > maxArea)
        		maxArea = areaArray[i];
        }
        
        return maxArea;
    }
    
    public int[] nextSmallerInLeft(int[] arr){
        int len = arr.length;
        Stack<Integer> stack = new Stack<Integer>();
        int[] ans = new int[len];
        
        for(int i = 0; i < len; i++){
			int currElement = arr[i];
			int nseIndex = -1;

			if(stack.empty()){
				nseIndex = -1;
			}
			else{
				while(stack.size() > 0 && arr[stack.peek()] >= currElement){
					stack.pop();
				}
				if(stack.empty()){
					nseIndex = -1;
				}
				else{
					nseIndex = stack.peek();
				}
			}
			ans[i] = (nseIndex);
			stack.push(i);
		}
        
        return ans;
    }
    
    public int[] nextSmallerInRight(int[] arr){
        int len = arr.length;
        Stack<Integer> stack = new Stack<Integer>();
        int[] ans = new int[len];
        
        for(int i = len - 1; i >= 0; i--){
			int currElement = arr[i];
			int nseIndex = len;

			if(stack.empty()){
				nseIndex = len;
			}
			else{
				while(stack.size() > 0 && arr[stack.peek()] >= currElement){
					stack.pop();
				}
				if(stack.empty()){
					nseIndex = len;
				}
				else{
					nseIndex = stack.peek();
				}
			}
			ans[i] = (nseIndex);
			stack.push(i);
		}
        
        return ans;
    }
}