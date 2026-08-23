class Solution {
    public int climbStairs(int n) {
        if(n == 1 || n == 2) return n;
        int[] DP = new int[n+1];
        DP[0] = 0; 
        DP[1] = 1;
        DP[2] = 2;
        for(int i = 3; i <= n; i++) {
            DP[i] = DP[i-1] + DP[i-2];
        }
        return DP[n];
    }
}
