class Solution:
    def partitionLabels(self, s: str) -> List[int]:
        last_occurrence = [0] * 26
        for i in range(len(s)):
            last_occurrence[ord(s[i]) - ord('a')] = i
        partition_end = 0
        partition_start = 0
        partition_sizes = []
        for i in range(len(s)):
            partition_end = max(partition_end, last_occurrence[ord(s[i]) - ord('a')])

            if i == partition_end:
                partition_sizes.append(i - partition_start+1)
                partition_start = i+1
        return partition_sizes