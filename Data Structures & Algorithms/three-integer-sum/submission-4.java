class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> output = new HashSet<>();
        Arrays.sort(nums); // -4,-3,-2,-1,-1,0,0,1,2,3,4
        
        for(int i = 0; i < nums.length; i++) {
            int k = i+1;
            int j = nums.length - 1;
            while(k < j) {
                if(nums[i] + nums[k]+ nums[j] == 0) {
                    output.add(Arrays.asList(nums[i], nums[k], nums[j]));  
                    k++;
                    j--;           
                }
                else if(nums[i] + nums[k]+ nums[j] < 0) {
                    k++;
                }
                else {
                    j--;
                }
            }
        }
        return  new ArrayList<>(output);
    }
}
