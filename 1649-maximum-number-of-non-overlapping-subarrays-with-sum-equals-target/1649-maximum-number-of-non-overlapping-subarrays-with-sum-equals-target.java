class Solution {
    public int maxNonOverlapping(int[] nums, int target) {
        int res = 0;
        Set<Integer> set = new HashSet<>();
        set.add(0);
        int prev = 0;
        for (int num : nums) {
            int val = num + prev;
            if (set.contains(val - target)) {
                res++;
                set = new HashSet<>();
            }
            set.add(val);
            prev = val;
        }
        return res;
    }
}