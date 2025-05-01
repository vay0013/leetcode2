class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[] {binarySearch(nums, target, true), binarySearch(nums, target, false)};
    }
    private int binarySearch(int[] nums, int target, boolean findLeft) {
        int index = -1;
        int left = 0, right = nums.length-1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                index = mid;
                if (findLeft) {
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
        return index;
    }
}