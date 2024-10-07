class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double result = Integer.MIN_VALUE;
        int cur = 0;
        for (int i = 0; i < nums.length; i++) {
            cur += nums[i];
            if (i >= k-1) {
                result = Math.max(result, cur);
                cur -= nums[i - (k-1)];
            }
        }
        return result/k;
    }
}