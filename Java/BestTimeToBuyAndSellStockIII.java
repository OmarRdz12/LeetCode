class Solution {
    public int maxProfit(int[] prices) {
        int oneBuyOneSell = 0;
        int twoBuyTwoSell = 0;
        int oneBuy = Integer.MAX_VALUE;
        int twoBuy = Integer.MAX_VALUE;
        int price = 0; 
        for(int i = 0; i < prices.length; i++) {
            price = prices[i];
            oneBuy = Math.min(oneBuy, price);
            oneBuyOneSell = Math.max(oneBuyOneSell, price - oneBuy);
            twoBuy = Math.min(twoBuy, price - oneBuyOneSell);
            twoBuyTwoSell = Math.max(twoBuyTwoSell, price - twoBuy);
        }
        return twoBuyTwoSell;
    }
}