class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> myMap = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            if (!myMap.containsKey(key)) {
                myMap.put(key, new ArrayList<>());
            }
            myMap.get(key).add(s);
        }
        return new ArrayList<>(myMap.values());   
    }
}
