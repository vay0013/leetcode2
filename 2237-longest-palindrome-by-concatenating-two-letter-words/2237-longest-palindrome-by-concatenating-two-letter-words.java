class Solution {
    public int longestPalindrome(String[] words) {
        int[][] freq = new int[26][26];
        List<String> same = new ArrayList<>();
        List<String> diff = new ArrayList<>();

        for (String word : words) {
            int f = word.charAt(0) - 'a';
            int s = word.charAt(1) - 'a';
            if (f == s) {
                if (freq[f][s] == 0) {
                    same.add(word);
                }
                freq[f][s]++;
                continue;
            }
            if (freq[s][f] != 0) {
                freq[f][s]++;
                continue;
            }
            if (freq[f][s] == 0) {
                diff.add(word);
            }
            freq[f][s]++;
        }
        int pairCount = 0;
        for (String word : diff) {
            int f = word.charAt(0) - 'a';
            int s = word.charAt(1) - 'a';
            pairCount += Math.min(freq[f][s], freq[s][f]);
        }
        int repeatCount = 0;
        int oddMax = 0;
        for (String word : same) {
            int index = word.charAt(0) - 'a';
            if (freq[index][index] % 2 == 1 && freq[index][index] > oddMax) {
                oddMax = freq[index][index];
            }
            int pair = freq[index][index] / 2;
            repeatCount += (2 * pair);
        }
        if (oddMax == 0) {
            return 4 * pairCount + 2 * repeatCount;
        }
        return 4 * pairCount + 2 * repeatCount + 2;
    }
}