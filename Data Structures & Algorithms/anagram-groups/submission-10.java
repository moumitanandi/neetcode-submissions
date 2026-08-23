class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagMap = new HashMap<>();

        for(String str: strs){
            char[] word = str.toCharArray();
            Arrays.sort(word);
            String sorted = new String(word);
            anagMap.putIfAbsent(sorted, new ArrayList<>());
            anagMap.get(sorted).add(str);
        }
        return new ArrayList<>(anagMap.values());
    }
}
