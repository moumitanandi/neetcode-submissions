class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> nmap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(nmap.containsKey(diff)) {
                return new int[]{nmap.get(diff), i};
            }
            nmap.put(nums[i], i); //3, 0 | 4, 1
        }
        return new int[2];
    }
}
