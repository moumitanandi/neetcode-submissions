class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price: prices){
            buyPrice = Math.min(price, buyPrice); //1
            maxProfit = Math.max(maxProfit, price - buyPrice); //-9
        }

        return maxProfit;
    }
}
