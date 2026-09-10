class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> gmap = new HashMap<>();

        for(String s: strs) {
            int[] word = new int[26];
            for(char c: s.toCharArray()) {
                word[c - 'a']++;
            }
            String key = Arrays.toString(word);
            
            gmap.putIfAbsent(key, new ArrayList<>());
            gmap.get(key).add(s);
        }

        return new ArrayList<>(gmap.values());
        
    }
}
