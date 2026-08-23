class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prod = new int[nums.length];
        for(int i = 0; i < nums.length; i++) { // 1
            int j = nums.length -1; 
            int temp = 1;
            while (j >= 0) {
                if(i != j) {
                    temp *= nums[j];  
                }             
                j--;                
           }
           prod[i] = temp;    
        }
        return prod;
    }
}  
