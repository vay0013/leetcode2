class Solution {
    public int singleNumber(int[] nums) {
        int mask = 0;
        for (int i : nums) {
            mask ^= i;
        }
        return mask;
    }
}