class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        oneBuyOneSell = 0
        twoBuyTwoSell = 0
        oneBuy = float('inf')
        twoBuy = float('inf')
        for i in prices:
            oneBuy = min(oneBuy, i)
            oneBuyOneSell = max(oneBuyOneSell, i - oneBuy)
            twoBuy = min(twoBuy, i - oneBuyOneSell)
            twoBuyTwoSell = max(twoBuyTwoSell, i - twoBuy)
        return twoBuyTwoSell
        