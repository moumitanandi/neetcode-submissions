class Solution {
    public int findDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = nums.length-1; j > i; j--) {
                if(nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        return -1;
    }
}
