class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++){
            buyPrice = Math.min(prices[i], buyPrice); //1
            maxProfit = Math.max(maxProfit, prices[i] - buyPrice); //-9
        }

        return maxProfit;
    }
}
