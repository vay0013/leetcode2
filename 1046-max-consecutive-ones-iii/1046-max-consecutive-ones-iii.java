class Solution {
    public int longestOnes(int[] nums, int k) {
        int skip = 0;
        int res = 0;
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                skip++;
            }
            while (skip > k) {
                if (nums[start] == 0) {
                    skip--;
                }
                start++;
            }
            res = Math.max(res, i - start + 1);
        }
        return res;
    }
}