class Solution {
    public int removeDuplicates(int[] nums) {
        int res = 1;
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[start]) {
                start++;
                nums[start] = nums[i];   
                res++;             
            }
        }
        return res;
    }
}