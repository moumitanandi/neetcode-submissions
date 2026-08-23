class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> dset = new HashSet<>();
        for(int n: nums) {
            if(dset.contains(n)) {
                return true;
            }
            else {
                dset.add(n);
            }
        }
        return false;
    }
}
