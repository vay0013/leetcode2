class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] pattern = new int[26];
        for (char c : s1.toCharArray()) {
            pattern[c - 'a']++;
        }
        int start = 0;
        int[] arr = new int[26];
        for (int i = 0; i < s2.length(); i++) {
            arr[s2.charAt(i) - 'a']++;
            if (i - start + 1 >= s1.length()) {
                if (match(pattern, arr)) {
                    return true;
                }
                arr[s2.charAt(start) - 'a']--;
                start++;
            }
        }
        return false;
    }
    private boolean match(int[] arr1, int[] arr2) {
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}