class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> sumMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i]; 
            if(!sumMap.containsKey(diff)) { 
                sumMap.put(nums[i], i); 
            }
            else { 
                return new int[]{sumMap.get(diff), i};
            }
        }
        return new int[]{};
    }
}
