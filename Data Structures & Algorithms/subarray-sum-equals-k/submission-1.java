class Solution {
    public int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> prefixSum = new HashMap<>();
        int sum = 0; 
        int count = 0;

        prefixSum.put(0, 1);
        for(int n: nums) { // 2 -1 1 2
            sum += n; // 2 1 2 4 
            int diff = sum - k;  //0 -1 0 2
            count += prefixSum.getOrDefault(diff, 0); // 1 1 2 4
            prefixSum.put(sum, prefixSum.getOrDefault(sum, 0) + 1); 
         
        }

        return count;
        
    }
}