class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0;
        int n = nums.length;
        int[] sum = new int[n+1];
        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i-1] + nums[i-1];
        }
        for (int start = 0; start < n; start++) {
            for (int end = start + 1; end <= n; end++) {
                if (sum[end] - sum[start] == k) {
                    res++;
                }
            }
        }
        return res;
    }
}