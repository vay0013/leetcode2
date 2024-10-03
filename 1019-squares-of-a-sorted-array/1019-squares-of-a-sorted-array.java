class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        for (int i = nums.length-1; i >= 0; i--) {
            int nLeft = nums[left] * nums[left];
            int nRight = nums[right] * nums[right];
            if (nLeft > nRight) {
                result[i] = nLeft;
                ++left;
            } else {
                result[i] = nRight;
                --right;
            }
        }
        return result;
    }
}