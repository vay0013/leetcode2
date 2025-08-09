class Solution {
    public int longestOnes(int[] nums, int k) {
        int res = 0;
        int left = 0;
        int skip = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                skip++;
            }
            while (skip > k) {
                if (nums[left] == 0) {
                    skip--;
                }
                left++;
            }
            res = Math.max(right - left + 1, res);
        }
        return res;
    }
}