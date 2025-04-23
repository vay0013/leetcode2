class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] res = new int[nums.length];
        int less = 0;
        int equal = 0;
        for (int num : nums) {
            if (num < pivot) {
                less++;
            } else if (num == pivot) {
                equal++;
            }
        }
        int lessI = 0;
        int equalI = less;
        int greaterI = less + equal;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                res[lessI] = nums[i];
                lessI++;
            } else if (nums[i] == pivot) {
                res[equalI] = nums[i];
                equalI++;
            } else {
                res[greaterI] = nums[i];
                greaterI++;
            }
        }
        return res;
    }
}