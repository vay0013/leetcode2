class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int num : nums) {
            int target = k - num;
            if (map.containsKey(target)) {
                map.put(target, map.get(target)-1);
                res++;
                if (map.get(target) == 0) {
                    map.remove(target);
                }
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        return res;
    }
}