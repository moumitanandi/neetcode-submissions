class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] la = new int[26];
        for(int i = 0; i < s.length(); i++) {
            la[s.charAt(i) - 'a']++;
            la[t.charAt(i) - 'a']--;
        }

        for(int n: la) {
            if(n != 0) return false;
        }
        return true;
        
    }
}
