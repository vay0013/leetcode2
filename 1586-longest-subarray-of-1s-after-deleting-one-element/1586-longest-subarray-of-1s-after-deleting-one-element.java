class Solution {
    public int longestSubarray(int[] nums) {
      int result = 0;
      int windowState = 0;
      int begin = 0;
      for (int end = 0; end < nums.length; end++) {
        if (nums[end] == 0) {
          windowState++;
        }
        while (windowState > 1) {
          if (nums[begin] == 0) {
            windowState--;
          }
          begin++;
        }
        result = Math.max(result, end - begin);
      }
      return result;
    }
}