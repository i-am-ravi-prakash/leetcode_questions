class Solution {

    public int trap(int[] height) {
        int len = height.length;
        int[] maxL = new int[len];
        int[] maxR = new int[len];
        int totalWater = 0;

        //find highest building in the left for each building
        maxL[0] = height[0];
        for(int i = 1; i < len; i++){
        	maxL[i] = Math.max(height[i], maxL[i - 1]);
        }

        //find highest building in the right for each building
        maxR[len - 1] = height[len - 1];
        for(int i = len - 2; i >= 0; i--){
        	maxR[i] = Math.max(height[i], maxR[i + 1]);
        }

        for (int i = 0; i < len; i++) {
            totalWater = totalWater + Math.min(maxL[i], maxR[i]) - height[i];
        }

        return totalWater;
    }
}
