class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> uset = new HashSet<>();

        int l = 0; 
        int longest = 0; 
        for(int r = 0; r < s.length(); r++) {
            while(uset.contains(s.charAt(r))) {
                uset.remove(s.charAt(l));
                l++;
                
            }
            uset.add(s.charAt(r));
            longest = Math.max(longest, r - l + 1);
            
            
        }

        return longest;  
          
    }
}
