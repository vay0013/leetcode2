class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0;
        int n = nums.length;
        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += nums[end];
                if (sum == k) {
                    res++;
                }
            }
        }
        return res;
    }
}