class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> aMap = new HashMap<>();
        
        for(String s: strs) {
            char[] cArray = s.toCharArray();
            Arrays.sort(cArray);
            String sorted = new String(cArray);
            if(!aMap.containsKey(sorted)) {
                aMap.put(sorted, new ArrayList<>());
            }
            aMap.get(sorted).add(s);
        }

        return new ArrayList<>(aMap.values());
    }
}
