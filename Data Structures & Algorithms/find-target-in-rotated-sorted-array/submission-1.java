class Solution {
    public int search(int[] nums, int target) {
        int i = 0; 
        int j = nums.length -1; //5
        while (i <= j) {
            int mid = i + (j - i) /2; //2
            System.out.println(mid);
            if(nums[mid] == target) { 
                return mid;
            }
            if(nums[i] <= nums[mid]) { 
                if(nums[mid] < target || target < nums[i]) {
                    i = mid + 1;
                } else { 
                    j = mid - 1;
                }
            } else { 
                if(nums[mid] > target || target > nums[j]) {
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            }
        }
        return -1;
    }
}
