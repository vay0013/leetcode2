class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start = 0;
        double res = Integer.MIN_VALUE;
        double cur = 0;
        for (int end = 0; end < nums.length; end++) {
            cur += nums[end];
            if (end - start + 1 == k) {
                res = Math.max(cur, res);
                cur -= nums[start];
                start++;
            }
        }
        return res/k;
    }
}