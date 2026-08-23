class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int res = 0; 
        // for(char c: s.toCharArray()){
        //     map.put(c, map.getOrDefault(c, 0) + 1);
        // }

        int l = 0;
        int count = 0;
        for(int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
             map.put(c, map.getOrDefault(c, 0) + 1);
             count = Math.max(count, map.get(c));
    
            if(r -l +1 - count > k) { //r = 3
                char lc = s.charAt(l);
                map.put(lc, map.get(lc) -1);
                l++;
            }
            res = Math.max(res, r-l+1);
        }
        return res;

    }
}
