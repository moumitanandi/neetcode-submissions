class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        
        int l = 0; 
        int res = 0; 
        int maxCount = 0; 
        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) +1); //A, 4
            maxCount = Math.max(maxCount, map.get(s.charAt(i))); //4
            
            while((i - l + 1) - maxCount > k) { // i = 6 (6 - 0 + 1) -> 7 - 4 
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1); //A, 4
                System.out.println("inside while: i " + i); //6
                l++; //2
            }
            
            res = Math.max(res, (i - l + 1)); //5
            System.out.println("res " + res); //5
        } 

        return res;   
    }
}
