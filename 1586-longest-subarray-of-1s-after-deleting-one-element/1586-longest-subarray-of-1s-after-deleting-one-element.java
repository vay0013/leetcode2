class Solution {
    public int longestSubarray(int[] nums) {
        int res = 0;
        int skip = 0;
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                skip++;
            }
            while (skip > 1) {
                if (nums[start] == 0) {
                    skip--;
                }
                start++;
            }
            res = Math.max(res, i - start);
        }
        return res;
    }
}