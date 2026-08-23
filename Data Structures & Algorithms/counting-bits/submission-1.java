class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        int offset = 1;
        for(int i = 1; i <= n; i++) {
            
            System.out.println("i " + i);
            if(i / 2 == offset){
                offset = i;
                System.out.println("if " + offset);
            }
            dp[i] = dp[i-offset] + 1; 
        }
        return dp;
        
    }
}
