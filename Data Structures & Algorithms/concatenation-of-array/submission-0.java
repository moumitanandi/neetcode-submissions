class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] output = new int[2 * len];

        for(int i = 0; i < len; i++) {
            output[i] = nums[i];
            output[i+len] = nums[i];
        } 
        return output;  
    }
}