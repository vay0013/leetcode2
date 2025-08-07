class Solution {
    public boolean increasingTriplet(int[] nums) {
        int min1 = nums[0];
        int min2 = Integer.MAX_VALUE;
        for (int i : nums) {
            if (min1 >= i) {
                min1 = i;
            } else if (min2 >= i) {
                min2 = i;
            } else {
                return true;
            }
        }
        return false;
    }
}