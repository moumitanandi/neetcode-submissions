class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> sum = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(sum.containsKey(diff)) {
                return new int[]{sum.get(diff), i};
            }
            sum.put(nums[i], i);
        }
        return new int[2];
    }
}
