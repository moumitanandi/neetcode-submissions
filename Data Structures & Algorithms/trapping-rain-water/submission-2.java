class Solution {
    public int trap(int[] height) {
        if(height.length <= 1) return 0;
        int i = 0; 
        int j = height.length-1;
        int yMin = height[i];
        int yMax = height[j]; 
        int area = 0; 

        while(i < j) {
            if(yMin < yMax){
                i++;
                yMin = Math.max(yMin, height[i]); //2
                area += yMin - height[i]; //-4
            }
            else {
                j--;
                yMax = Math.max(yMax, height[j]);
                area += yMax - height[j]; //2
            }
        }
        return area;
    }
}
