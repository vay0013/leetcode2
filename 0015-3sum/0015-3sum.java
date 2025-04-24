class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<ArrayList<Integer>> res = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int target = -nums[i];
            int left = i+1, right = nums.length - 1;
            while (left < right) {
                if (nums[left] + nums[right] == target) {
                    ArrayList<Integer> arr = new ArrayList<>();
                    arr.add(-target);
                    arr.add(nums[left]);
                    arr.add(nums[right]);
                    res.add(arr);
                }
                if (nums[left] + nums[right] > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return new ArrayList<>(res);
    }
}