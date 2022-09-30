class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        
        if(len(set(heights)) == 1):
            return len(heights)*heights[0]
        
        max_area = 0
        
        for i in range(0, len(heights)):
            curr_area = 0
            curr_num = heights[i]
            count = 0
            area_sofar = 0
            for j in range(i, len(heights)):
                count+=1
                curr_num = min(curr_num,heights[j])
                curr_area = count*curr_num
                
                if(curr_area>area_sofar):
                    area_sofar = curr_area
                
                
            if area_sofar>max_area:
                max_area = area_sofar
        
        
        return max_area
        
        
    def largestRectangleArea(self, heights: List[int]) -> int:
        
        stack = []
        maxrect = 0
        
        for i, h in enumerate(heights):
            start = i
            while (stack and stack[-1][1] > h):
                idx, ht = stack.pop()
                maxrect = max(maxrect, (i - idx)*ht)
                start = idx
            stack.append((start, h))
        
        while (stack):
            idx, ht = stack.pop()
            maxrect = max(maxrect, (len(heights) - idx)*ht) 
        
        return maxrect