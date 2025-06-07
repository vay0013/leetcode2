class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int res = 0;
        for (int i = 0; i < endTime.length; i++) {
            int start = startTime[i];
            int end = endTime[i];
            if (start <= queryTime && queryTime <= end) {
                res++;
            }
        }
        return res;
    }
}