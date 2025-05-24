class Solution {
    public long countSubarrays(int[] nums, int k) {
        long res = 0;
        int max = 0, start = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        int count = 0;
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == max) {
                count++;
            }
            while (count == k) {
                if (nums[start] == max) {
                    count--;
                }
                start++;
            }
            res += start;
        }
        return res;
    }
}