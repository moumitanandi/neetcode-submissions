class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price: prices) {
            minPrice = Math.min(minPrice, price); //10 1 1 1 1 1
            maxProfit = Math.max(maxProfit, (price - minPrice)); //0 1 4 5 6
        }
        return maxProfit;
    }
}
