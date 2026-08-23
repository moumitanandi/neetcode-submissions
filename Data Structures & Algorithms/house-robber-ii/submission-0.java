class Solution {
    public int rob(int[] nums) {
        int maxAmount = Math.max(nums[0], helper(Arrays.copyOfRange(nums, 1, nums.length)));
        maxAmount = Math.max(maxAmount, helper(Arrays.copyOfRange(nums, 0, nums.length-1)));

        return maxAmount;
    }
    
    public int helper(int[] nums) {
        int rob1 = 0; 
        int rob2 = 0;
         for(int n: nums){
           int amount = Math.max(n + rob1, rob2);
           rob1 = rob2;
           rob2 = amount;
        }
        return rob2;  
    }
}
