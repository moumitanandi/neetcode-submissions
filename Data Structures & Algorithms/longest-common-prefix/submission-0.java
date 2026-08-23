class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++){
            int len = Math.min(prefix.length(), strs[i].length());
            int j = 0; 
            while (j < len) {
               if(strs[i-1].charAt(j) != strs[i].charAt(j)) {
                    break;
               }
               j++;
            }
            prefix = prefix.substring(0, j);
        }
        return prefix;
    }
}