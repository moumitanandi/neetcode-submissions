class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seqset = new HashSet<>();
        int maxlen = 0; 
        int l = 0; 
        int r = 0;
        while(l < s.length() && r < s.length()) {
            if(!seqset.contains(s.charAt(r))) {
                seqset.add(s.charAt(r));
                maxlen = Math.max(maxlen, r - l +1 );
                r++;
            }
            else {
                seqset.remove(s.charAt(l));
                l++;
            }
        }
    
        return maxlen;
    }
}
