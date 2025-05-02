class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int cur = 0;
        for (int i = 0; i < nums.length; i++) {
            if (cur*2 == sum - nums[i]) {
                return i;
            }
            cur += nums[i];
        }
        return -1;
    }
}