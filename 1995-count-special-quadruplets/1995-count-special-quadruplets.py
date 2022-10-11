class Solution:
    def countQuadruplets(self, nums: List[int]) -> int:
        
        map = {}
        values = set()
        
        count = 0
        
        for a in range(0,len(nums)):
            for b in range(a+1, len(nums)):
                curr_sum = nums[a]+nums[b]
                map[curr_sum] = map.get(curr_sum,[]) + [b]
        
        for c in range(0,len(nums)):
            for d in range(c+1, len(nums)):
                curr_sum = (nums[d] - nums[c])
                
                if curr_sum in map:
                    values = map.get(curr_sum)
                    #loop over tuples
                    for p in values:
                        if c>p:
                            count+=1
        
        return count
        
        
        