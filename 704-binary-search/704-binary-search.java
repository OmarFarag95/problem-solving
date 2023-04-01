class Solution {
    /*public int search(int[] nums, int target) {
        
        int l = 0;
        int r = nums.length-1;
        
        while(l<=r)
        {
            int mid = (r-l)/2 + l;
            
            if(nums[mid] == target)
                return mid;
            else if(nums[mid]>target)
                r = mid-1;
            else if(nums[mid]<target)
                l = mid+1;
            else continue;
        }
        
        return -1;
    }*/
    
    
    public int search(int[] nums, int target) {
        
        int l = 0;
        int r = nums.length-1;
        
        return search_rec(nums, target, l, r);
    }
    
    
    public int search_rec(int[] nums, int target, int l, int r)
    {
        int mid = (r-l)/2 + l;
        
        if(l>r)
            return -1;
        
        if(nums[mid] == target)
            return mid;
        
        else if(nums[mid] > target)
            return search_rec(nums, target, l, mid-1);
        else 
            return search_rec(nums, target, mid+1, r);
        
    }   
}