class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> cur = new ArrayList<>();
        dfs(nums, target, 0, cur, 0); 
        return res;
    }

    public void dfs(int[] nums, int target, int total, List<Integer> cur, int i) {
        if(target == total) {
            res.add(new ArrayList(cur));
            return;
        }
        for(int j = i; j < nums.length; j++) {
            if(target < total + nums[j]) {
                return;
            }
            cur.add(nums[j]);
            dfs(nums, target, total + nums[j], cur, j);
            cur.remove(cur.size() -1);
        }
    }
}
