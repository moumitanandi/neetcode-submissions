class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        
        for(int n: nums) {
            mySet.add(n);
        }

        int longest = 0;

        for(int n: nums) {
            if(!mySet.contains(n-1)) {
                int length = 1;
                while (mySet.contains(n + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }

        }
        return longest;
    }
}
