class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> myMap = new HashMap<>();

        for(String s: strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String newS = new String(c);
            if(!myMap.containsKey(newS)) {
                myMap.put(newS, new ArrayList<String>());        
            }
            myMap.get(newS).add(s);
        }

        return new ArrayList<>(myMap.values());

    }
}
