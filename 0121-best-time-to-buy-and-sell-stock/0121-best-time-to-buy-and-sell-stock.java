class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int minPrice = prices[0];
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            res = Math.max(res, price - minPrice);
        }
        return res;
    }
}