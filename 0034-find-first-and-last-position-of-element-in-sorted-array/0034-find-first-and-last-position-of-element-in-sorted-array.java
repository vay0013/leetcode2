class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[] {findIndex(nums, target, true), findIndex(nums, target, false)};
    }
    private int findIndex(int[] nums, int target, boolean isFindLeft) {
        int i = -1;
        int left = 0, right = nums.length-1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                i = mid;
                if (isFindLeft) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return i;
    }
}