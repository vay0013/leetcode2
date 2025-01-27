class Solution {
    public int longestOnes(int[] nums, int k) {
      int result = 0;
      int windowState = 0; // how mach 0?
      int begin = 0;
      int end;
      for (end = 0; end < nums.length; end++) {
        if (nums[end] == 0) {
          windowState++;
        }
        while (windowState > k) {
          if (nums[begin] == 0) {
            windowState-=1;
          }
          begin++;
        }
        result = Math.max(result, end - begin + 1);
      }
      return result;
    }
}