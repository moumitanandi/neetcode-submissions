class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] product = new int[nums.length];
        int left = 1;
        int right = 1;
        for(int i = 0; i < nums.length; i++) {
            product[i] = left; //[0]=1 [1] = 1 [2]=2 [3] = 8
            left *= nums[i]; //l= 1, l= 2 l = 8 
        }
        //1, 1, 2, 8
        for(int i = nums.length-1; i >= 0; i--) {
            product[i] *= right; //[4]=1*8 [3] = 6*2 [2]=24*1 [1] = 48
            right *= nums[i]; //=r 6, l= 24 l = 48 
        }
        return product;
    }
}  
