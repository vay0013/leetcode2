class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i : nums) {
            if (nums[Math.abs(i) - 1] < 0) {
                result.add(Math.abs(i));
            }
            nums[Math.abs(i) - 1] *= -1;
        }
        return result;
    }
}