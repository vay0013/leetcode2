class Solution {
    public int maxOperations(int[] nums, int k) {
        int result = 0;
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
          if (nums[left] + nums[right] == k) {
            result++;
            left++;
            right--;
            continue;
          }
          if (nums[left] + nums[right] > k) {
              right--;
          } else {
            left++;
          }
        }
        return result;
    }
}