class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
      int n = s.length();
        boolean dp[] = new boolean[n+1];
        dp[n]=true;

        for(int i = n-1; i >= 0; i--){
            StringBuilder word = new StringBuilder();

            for(int j = i; j < n; j++){
                word.append(s.charAt(j));
                // As the maximum word length in the dictionary is 20.
                if(word.length() > 20) {
                    break;
                }
                if(dp[j + 1] && wordDict.contains(word.toString())){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[0];
    }
}
