class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> amap = new HashMap<>();
        
        for(char c : s.toCharArray()){
            amap.put(c, amap.getOrDefault(c, 0) + 1);
        }
        for(char c : t.toCharArray()){
            if(amap.containsKey(c)) {
                System.out.println("found; " + c);
                System.out.println("found value; " + amap.get(c));
                amap.put(c, amap.get(c) - 1);
            }
            else {
                amap.put(c, amap.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println(amap.values());
        ArrayList<Integer> charFreqs = new ArrayList(amap.values());
        for(int i: charFreqs) {
            if(i > 0) {
                return false;
            }
        } 
        return true;
    }
}
