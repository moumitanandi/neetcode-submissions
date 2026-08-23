class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> mSet = new HashSet<>();

        for(int i: nums) {
            mSet.add(i);
        }
        int longest = 0;
        for(int m: nums) {
            int counter = 1;
            while(mSet.contains(m + counter)) { 
                counter++; 
            }
            longest = Math.max(longest, counter);
        }
        return longest;
    }
}
