/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (0 == guess(mid)) {
                return mid;
            }
            if (-1 == guess(mid)) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return -1;
    }
}