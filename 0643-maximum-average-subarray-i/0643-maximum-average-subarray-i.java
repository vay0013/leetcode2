class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double result = Integer.MIN_VALUE;
        int begin = 0;
        int cur = 0;
        for (int end = 0; end < nums.length; end++) {
          cur += nums[end];
          if (end - begin + 1 == k) {
            result = Math.max(result, cur);
            cur -= nums[begin];
            begin++;
          }
        }
        return result/k;
    }
}