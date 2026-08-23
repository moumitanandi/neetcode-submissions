class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> mSet = new HashSet<>();

        for(int i: nums) {
            mSet.add(i);
        }
        int counter = 0;
        int longest = 0;
        for(int m: nums) {
            int temp = 0;
            counter = m;
            while(mSet.contains(counter)) { //5 5
                counter++; 
                temp++; //4 
            }
            longest = Math.max(longest, temp);
        }
        return longest;
    }
}
