class Solution {
    public int findMin(int[] nums) {
        int i = 0; 
        int j = nums.length -1;

        while (i < j) {
            int mid = i + (j - i)/2; //2 4 
            System.out.println(" mid : " + mid);
            if(nums[mid] < nums[j]) { // 1 < 2
                j = mid; // 
                System.out.println(" j : " + j);
            }
            else { // 5 > 2
                i = mid + 1; // 3
                System.out.println(" i : " + i);
            }
        }
        return nums[i];
    }
}
