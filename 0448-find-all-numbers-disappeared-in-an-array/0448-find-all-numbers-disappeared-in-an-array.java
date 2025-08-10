class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int pos = nums[i] - 1;
            if (nums[pos] != nums[i]) {
                int tmp = nums[pos];
                nums[pos] = nums[i];
                nums[i] = tmp;
            } else {
                i++;
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1) {
                res.add(j+1);
            }
        }
        return res;
    }
}