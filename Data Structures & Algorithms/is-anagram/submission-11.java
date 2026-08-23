class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Integer> mset = new HashMap<>();
        for(char c: s.toCharArray()) {
            mset.put(c, mset.getOrDefault(c, 0)+ 1);
        }
        for(char c: t.toCharArray()) {
            if(!mset.containsKey(c)) return false;

            mset.put(c, mset.getOrDefault(c, 0) -1);
            if(mset.get(c) == 0) {
                mset.remove(c);
            }
        }

        if(mset.size() == 0) return true;
        else return false;
    }
}
