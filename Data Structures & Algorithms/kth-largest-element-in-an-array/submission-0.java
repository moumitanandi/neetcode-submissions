class Solution {
     public int findKthLargest(int[] nums, int k) {
        k = nums.length - k;
        int l = 0;
        int r = nums.length -1;

        while (l < r) {
            int pivot = partition(nums, l, r);
            if(pivot < k) {
                l = pivot + 1;
            }
            else if(pivot > k) {
                r = pivot -1;
            }
            else break;
        }
        return nums[k];
    }

    private int partition(int[] nums, int l, int r) {
        int pivot = nums[r];
        int m = l;

        for(int i = l; i < r; i++){
            if(nums[i] <= pivot) {
                int tmp = nums[m];
                nums[m] = nums[i];
                nums[i] = tmp;
                m++;
            }
        }
        nums[r] = nums[m];
        nums[m] = pivot;
        return m;
    }
}
