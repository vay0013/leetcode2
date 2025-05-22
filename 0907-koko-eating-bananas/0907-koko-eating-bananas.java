class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = Integer.MAX_VALUE;
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
            int div = pile / speed;
            spend += div;
            spend += pile % speed != 0 ? 1 : 0;
        }
        return spend <= h;
    }
}