class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        result = 0
        min_price = float("inf")
        for price in prices:
            min_price = min(min_price, price)
            result = max(result, price - min_price)
        return result