class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> gmap = new HashMap<>();

        for(String s: strs) {
            char[] sorted = s.toCharArray();
            Arrays.sort(sorted);
            String newStr = new String(sorted);
            
            gmap.putIfAbsent(newStr, new ArrayList<>());
            gmap.get(newStr).add(s);
        }

        return new ArrayList<>(gmap.values());
        
    }
}
