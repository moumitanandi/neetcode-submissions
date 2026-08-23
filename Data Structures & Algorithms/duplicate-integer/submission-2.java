class Solution {
    Set<Integer> mySet = new HashSet<>();
    public boolean hasDuplicate(int[] nums) {
        for(int n: nums) {
            if(mySet.contains(n)) { 
                return true;
            }
            mySet.add(n);
        }
        return false;
    }
}
