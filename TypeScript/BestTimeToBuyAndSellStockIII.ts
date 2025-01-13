function maxProfit(prices: number[]): number {
    let oneBuyOneSell: number = 0;
    let twoBuyTwoSell: number = 0;
    let oneBuy: number = Number.POSITIVE_INFINITY;
    let twoBuy: number = Number.POSITIVE_INFINITY;
    for(let i = 0; i < prices.length; i++) {
        const price: number = prices[i];
        oneBuy = Math.min(oneBuy, price);
        oneBuyOneSell = Math.max(oneBuyOneSell, price - oneBuy);
        twoBuy = Math.min(twoBuy, price - oneBuyOneSell);
        twoBuyTwoSell = Math.max(twoBuyTwoSell, price - twoBuy);
    }
    return twoBuyTwoSell;
};