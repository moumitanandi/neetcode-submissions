class Solution {
    public int search(int[] nums, int target) {
        
        int low = 0; 
        int high = nums.length - 1; // 6

        while (low < high) {
            int m = low + (high - low)/2; //3
            if(nums[m] > nums[high]) {
                low = m + 1;
            }
            else {
                high = m;
            }
        }

        if(bs(nums, 0, low -1, target) != -1) 
            return bs(nums, 0, low -1, target);
        else if(bs(nums, low, nums.length -1, target) != -1) 
            return bs(nums, high, nums.length -1, target);
        else 
            return -1;
    }

    public int bs(int[] nums, int i, int j, int target) {
        while(i <= j) {
            int mid = i + (j - i) /2;
            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] > target) {
                j = mid - 1;
            }
            else {
                i = mid + 1;
            }
        }
        return -1;
    }
}
