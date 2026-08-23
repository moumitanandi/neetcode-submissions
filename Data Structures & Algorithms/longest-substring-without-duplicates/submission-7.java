class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();

        int l = 0;
        int res = 0;
        for(int r = 0; r < s.length(); r++) {
            while(set.contains(s.charAt(r))) {
                System.out.println("contains r : " + s.charAt(r));
                set.remove(s.charAt(l));
                System.out.println("contains l : " + s.charAt(l));
                l++;
            }
            System.out.println("before add : " + s.charAt(r));
            set.add(s.charAt(r));
            System.out.println("res : " + res);
            res = Math.max(res, r -l +1);
        }
        return res;
    }        

}
