class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         if(strs.length == 0) return new ArrayList<>();

         List<List<String>> result = new ArrayList<>();
         
         if(strs.length == 1) {
            result.add(Arrays.asList(strs));
            return result;
         }

         Map<String, List<String>> myMap = new HashMap<>();
         

         for(String s: strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String newStr = new String(c);
            if(!myMap.containsKey(newStr)) {
                List<String> tmp = new ArrayList<>();
                tmp.add(s);
                myMap.put(newStr, tmp);
            }
            else {
                List<String> tmp = myMap.get(newStr);
                tmp.add(s);
                myMap.put(newStr, tmp);
            }
         }

         for(Map.Entry<String, List<String>> entry: myMap.entrySet()) {
            result.add(entry.getValue());
         }

         return result;

    }
}
