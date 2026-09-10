class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> smap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(smap.containsKey(diff)) {
                return new int[]{smap.get(diff), i};
            }
            smap.put(nums[i], i);
        }

        return new int[]{};
        
    }
}
