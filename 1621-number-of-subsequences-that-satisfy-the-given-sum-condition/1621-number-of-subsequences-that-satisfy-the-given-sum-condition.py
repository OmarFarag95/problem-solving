class Solution:
    def numSubseq(self, nums: List[int], target: int) -> int:
        MOD = 10**9 + 7
        
        nums.sort()
        size = len(nums)
        answer = 0
        
        start = 0
        end = size - 1

        while start <= end:
            smallest = nums[start]
            largest = nums[end]

            if smallest + largest <= target:
                count = pow(2, end - start, MOD)
                answer = (answer + count) % MOD
                start += 1
            else:
                end -= 1

        return answer