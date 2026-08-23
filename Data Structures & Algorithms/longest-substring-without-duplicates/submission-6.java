class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();

        int l = 0; 
        int r = 0; 
        int res = 0; 
        while (l < s.length() && r < s.length()) {
            while(seen.contains(s.charAt(r))) {
                seen.remove(s.charAt(l));
                l++;
            }
            seen.add(s.charAt(r));
            res = Math.max(res, r - l + 1);   
            r++;   
        }
        return res;
    }
}
