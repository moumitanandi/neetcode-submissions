class Solution {
    public int search(int[] nums, int target) {
        int i = 0; 
        int j = nums.length -1;
        while (i <= j) {
            int k = i + ((j - i) / 2);
            if(nums[k] == target) {
                return k;
            }
            else if(nums[k] < target) {
                i++;
            }
            else {
                j--;
            }
        }
        return -1;
    }

}
