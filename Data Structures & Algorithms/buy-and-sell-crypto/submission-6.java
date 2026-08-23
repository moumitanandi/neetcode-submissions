class Solution {
    public int maxProfit(int[] prices) {
        int buyerPrice = prices[0];
        int maxProfit = 0; 
        for(int i : prices) {
            buyerPrice = Math.min(buyerPrice, i);
            maxProfit = Math.max(maxProfit, i - buyerPrice); 
        }

        return maxProfit;
        
    }
}
