class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];
        int n = nums.length;
        for (int i = 0; i < n-1; ++i) {
            int comp = target - nums[i];
            int left = i+1;
            int right = n-1;
            while (left < right) {
                int sum = nums[left] + nums[right] + nums[i];
                if (sum == target) {
                    return target;
                }
                if (Math.abs(target - sum) < Math.abs(target - res)) {
                    res = sum;
                }
                if (nums[left] + nums[right] > comp) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return res;
    }
}