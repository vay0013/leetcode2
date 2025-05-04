class Solution {
    public int longestOnes(int[] nums, int k) {
        int res = 0;
        int skip = 0;
        int start = 0;
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 0) {
                skip++;
            }
            while (skip > k) {
                if (nums[start] == 0) {
                    skip--;
                }
                start++;
            }
            res = Math.max(res, end - start +1);
        }
        return res;
    }
}