class Solution {
    public int trap(int[] height) {
        if(height.length == 0 || height == null) return 0;

        int maxArea = 0;
        int i = 0; 
        int j = height.length -1;
        int yMin = height[i];
        int yMax = height[j];

        while(i < j) {
            if(yMin < yMax) {
                i++;
                yMin = Math.max(yMin, height[i]);
                maxArea += yMin - height[i];
            }
            else {
                j--;
                yMax = Math.max(yMax, height[j]);
                maxArea += yMax - height[j];

            }
        }
        return maxArea;
    }
}
