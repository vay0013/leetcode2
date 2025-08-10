class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int res = Integer.MAX_VALUE;
        int start = 0;
        int cur = 0;
        for (int end = 0; end < nums.length; end++) {
            cur += nums[end];
            while (target <= cur) {
                res = Math.min(res, end - start + 1);
                cur -= nums[start];
                start++;
            }
        }
        if (res == Integer.MAX_VALUE) {
            return 0;
        }
        return res;
    }
}