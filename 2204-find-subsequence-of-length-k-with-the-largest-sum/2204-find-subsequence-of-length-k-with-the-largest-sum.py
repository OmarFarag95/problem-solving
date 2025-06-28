class Solution:
    def maxSubsequence(self, nums: List[int], k: int) -> List[int]:
        heap = []
        for i, num in enumerate(nums):
            heapq.heappush(heap, (num, i))
            if len(heap) > k:
                heapq.heappop(heap)

        indices = sorted(heap, key= lambda x: x[1])
        return [v for v,idx in indices] 