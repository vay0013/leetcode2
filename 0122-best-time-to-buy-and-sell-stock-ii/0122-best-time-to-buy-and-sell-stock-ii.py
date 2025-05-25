class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buy = float('-inf')
        sell = 0
        for price in prices:
            next_buy = max(buy, sell - price)
            next_sell = max(sell, buy + price)

            buy = next_buy
            sell = next_sell
        return sell