class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> mySet = new HashSet<>();
        int maxLen = 0;
        int l = 0; 
        int r = 0;
        while(l < s.length() && r < s.length()) { 
            if(!mySet.contains(s.charAt(r))) { // abc  l = 0 r = 3
                mySet.add(s.charAt(r));
                System.out.println("if " + s.charAt(r) + "& r : " + r);
                maxLen = Math.max(maxLen, r - l + 1); // 3
                r++;
            }
            else {
                mySet.remove(s.charAt(l)); //   l = 2 r = 2
                System.out.println("else "  + s.charAt(l) + "& l : " + l);
                l++;
            }
        
            
        }
        return maxLen;
    }
}
