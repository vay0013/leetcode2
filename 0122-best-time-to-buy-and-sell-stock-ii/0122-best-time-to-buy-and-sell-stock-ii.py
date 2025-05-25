class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0
        min_price = prices[0]
        for price in prices:
            if min_price < price:
                profit += price - min_price
                min_price = price
            min_price = min(price, min_price)
        return profit