class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> amap = new HashMap<>();

        for(String s: strs) {
            char[] cArray = s.toCharArray();
            Arrays.sort(cArray);
            String sorted = new String(cArray);
            if(!amap.containsKey(sorted)) {
                amap.put(sorted, new ArrayList<>());
            }
            amap.get(sorted).add(s);        
       } 

       return new ArrayList<>(amap.values());
    }
}
