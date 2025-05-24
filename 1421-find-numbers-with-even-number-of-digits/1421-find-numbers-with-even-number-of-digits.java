class Solution {
    public int findNumbers(int[] nums) {
        int res = 0;
        for (int i : nums) {
            res += Integer.toString(i).length() % 2 == 0 ? 1 : 0;
        }
        return res;
    }
}