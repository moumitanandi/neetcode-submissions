class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Integer> myMap1 = new HashMap<>();
        Map<Character, Integer> myMap2 = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            myMap1.put(s.charAt(i), myMap1.getOrDefault(s.charAt(i), 0) + 1);
            myMap2.put(t.charAt(i), myMap2.getOrDefault(t.charAt(i), 0) + 1);
        }
        return myMap1.equals(myMap2);
    }


}
