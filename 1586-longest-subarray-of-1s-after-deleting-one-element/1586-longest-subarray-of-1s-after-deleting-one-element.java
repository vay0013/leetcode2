class Solution {
    public int longestSubarray(int[] nums) {
        int res = 0;
        int skip = 0;
        int start = 0;
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 0) {
                skip++;
            }
            while (skip > 1) {
                if (nums[start] == 0) {
                    skip--;
                }
                start++;
            }
            res = Math.max(res, end - start);
        }
        return res;
    }
}