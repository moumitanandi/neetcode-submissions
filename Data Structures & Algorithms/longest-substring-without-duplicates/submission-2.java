class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> mset = new HashSet<Character>();
        int minLength = 0;
        int counter= 0;
        for(int i = 0; i < s.length(); i++){
            while (mset.contains(s.charAt(i))) {
                mset.remove(s.charAt(counter)); 
                counter++;   
            }
            mset.add(s.charAt(i));
            minLength = Math.max(minLength, i - counter + 1);
            
            
        }
        return minLength;
    }
}
