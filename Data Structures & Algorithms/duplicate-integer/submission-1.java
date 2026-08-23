class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> mySet = new HashSet<>();

        for(int n: nums) {
            if(mySet.contains(n)){
                return true;
            }
            mySet.add(n);
        }
        return false;
    }
}
