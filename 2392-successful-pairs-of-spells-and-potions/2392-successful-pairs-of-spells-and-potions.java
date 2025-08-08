class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = spells.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = potions.length-1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                long product = (long) potions[mid] * spells[i];
                if (product >= success) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            res[i] = potions.length-left;
        }
        return res;
    }
}