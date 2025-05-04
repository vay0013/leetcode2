class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        Set<List<Integer>> res = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int left = i+1;
            int right = n-1;
            int target = -nums[i];
            while (left < right) {
                if (nums[left] + nums[right] == target) {
                    List<Integer> arr = new ArrayList<>();
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