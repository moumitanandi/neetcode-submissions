class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        Map<Character, Integer> amap = new HashMap<>();

        for(char c: s.toCharArray()) {
            amap.put(c, amap.getOrDefault(c, 0) +1);
        }

        for(char c: t.toCharArray()) {
            if(!amap.containsKey(c)) return false;
            else {
                amap.put(c, amap.get(c) -1);
                if(amap.get(c) == 0) {
                    amap.remove(c);
                }
            }
        }
        if(amap.size() == 0) return true;
        else return false;


    }
}
