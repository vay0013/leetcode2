class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      int result = Integer.MAX_VALUE;
      int begin = 0;
      int cur = 0;
      for (int end = 0; end < nums.length; end++) {
        cur += nums[end];
        while (target <= cur) {
          result = Math.min(result, end - begin + 1);
          cur -= nums[begin];
          begin++;
        }
      }
      if (result == Integer.MAX_VALUE) {
        return 0;
      }
      return result;
    }
}