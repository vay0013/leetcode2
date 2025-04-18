class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        n = len(nums)
        result = [0] * n
        k %= n
        for i in range(n):
            result[(k+i) % n] = nums[i]
        nums[:] = result[:]