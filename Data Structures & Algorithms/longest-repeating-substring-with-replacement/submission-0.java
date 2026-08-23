class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int result = 0;
        int max = 0;
        int i = 0; 
        for(int j = 0; j < s.length(); j++) {
            arr[s.charAt(j) - 'A']++; //XYYX
            max = Math.max(max,  arr[s.charAt(j) - 'A']); //2
            if(j - i + 1 - max > k) { //2 - 1 + 1 - 2 > 
                arr[s.charAt(i) - 'A']--; //0
                i++; //2
            }
            result = Math.max(result, j - i + 1); // 4- 2 + 1
        }
        return result;
     }
}
