class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        result = 0
        min_cost = prices[0]
        for price in prices:
            min_cost = min(min_cost, price)
            if min_cost < price:
                result += price - min_cost
                min_cost = price
        return result