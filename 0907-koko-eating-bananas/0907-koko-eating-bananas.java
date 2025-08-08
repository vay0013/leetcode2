class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Integer.MAX_VALUE;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canEat(piles, h, mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    private boolean canEat(int[] piles, int h, int speed) {
        int spend = 0;
        for (int pile : piles) {
            int cur = pile / speed;
            cur += pile % speed == 0 ? 0 : 1;
            spend += cur;
        }
        return spend <= h;
    }
}