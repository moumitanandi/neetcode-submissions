class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length() != t.length()) return false;
    if(s.length() == 1) return s.equals(t);

	Map<Character, Integer> amap = new HashMap<>();
	for(char c: t.toCharArray()){
		amap.put(c, amap.getOrDefault(c, 0) + 1);
    }

	for(char c: s.toCharArray()){	
        if(amap.containsKey(c)) {
			amap.put(c, amap.get(c) - 1);
	    }
        else {
		    amap.put(c, amap.getOrDefault(c, 0) + 1);
		}
        if(amap.get(c) == 0) {
            amap.remove(c);
        }
    }

	if(amap.size() == 0) return true;
      
	return false;
    }
}
