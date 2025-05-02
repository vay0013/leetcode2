class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int window = 0;
        int start = 0;
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            window += nums[i];
            if (i - start +1 == k) {
                res = Math.max(res, window);
                System.out.println(res);

                window -= nums[start];
                start++;
            }
        }
        return (double)res / k;
    }
}