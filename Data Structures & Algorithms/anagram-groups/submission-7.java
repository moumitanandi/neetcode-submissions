class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String s: strs) {
            char[] cArray = s.toCharArray();
            int[] count = new int[26]; 
            for(char c: cArray) {
                count[c - 'a']++;
            }
            System.out.println("counter: " + Arrays.toString(count));
            String sorted = Arrays.toString(count);
            map.putIfAbsent(sorted, new ArrayList<>());
            map.get(sorted).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
