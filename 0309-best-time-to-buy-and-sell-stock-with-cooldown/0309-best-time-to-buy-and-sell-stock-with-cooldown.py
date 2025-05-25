class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buy = float("-inf")
        sell = 0
        cooldown = 0
        for price in prices:
            next_buy = max(buy, cooldown - price)
            next_sell = buy + price
            cooldown = max(sell, cooldown)

            sell = next_sell
            buy = next_buy
        return max(sell, cooldown)