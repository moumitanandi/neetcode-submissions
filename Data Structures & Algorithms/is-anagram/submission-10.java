class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Integer> anagramMap = new HashMap<>();

        for(char c: s.toCharArray()){
            anagramMap.put(c, anagramMap.getOrDefault(c, 0)+1);
        }

        for(char c: t.toCharArray()) {
            if(!anagramMap.containsKey(c)) {
                return false;
            }
            anagramMap.put(c, anagramMap.get(c)-1);
            if(anagramMap.get(c) == 0){
                anagramMap.remove(c);
            }
        }
        if(anagramMap.size() == 0) return true;
        else return false;

    }
}
