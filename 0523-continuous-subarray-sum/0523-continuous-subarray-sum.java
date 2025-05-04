class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int prefixMod = 0;
        Map<Integer, Integer> seen = new HashMap<>();
        seen.put(0, -1); // если первый эелемент nums[0] % k == 0 
        for (int i = 0; i < nums.length; i++) {
            prefixMod = (prefixMod + nums[i]) % k;
            if (seen.containsKey(prefixMod)) {
                if (i - seen.get(prefixMod) > 1) {
                    return true;
                }
            } else {
                seen.put(prefixMod, i);
            }
        }
        return false;
    }
}