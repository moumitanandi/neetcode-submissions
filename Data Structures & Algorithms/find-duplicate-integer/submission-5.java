class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0], fast = nums[0]; //1
        do{
            slow = nums[slow]; // nums[1] = 2 nums[2] = 3
            fast = nums[nums[fast]]; // nums[nums[1]] = nums[2] = 3. nums[nums[3]] = nums[2] = 3
            System.out.println("slow: " + slow);
            System.out.println("fast: " + fast);
        } while(slow != fast);

        slow = nums[0]; //1
        while(slow != fast) {
            slow = nums[slow]; //nums[1] = 2
            fast = nums[fast]; //nums[3] = 2
        }

        return slow;
        
    }
}
