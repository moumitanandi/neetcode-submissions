class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> unique = new HashSet();
        int longest = 0;
        int i = 0;
        for(int j = 0; j < s.length(); j++){
            while(unique.contains(s.charAt(j))) {
                unique.remove(s.charAt(i));      
                i++;
            }
            unique.add(s.charAt(j));
            longest = Math.max(longest, j - i + 1);
            
        }
        return longest;       
    }
}
