class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        
        int max = -1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<=0)
            {
                int index = binarysearch(nums, nums[i]*-1, 0, nums.length-1);
                if(index!=-1)
                {
                    if(nums[index]>max)
                        max = nums[index];
                }
            }
        }
        
        return max;
        
    }
    
    
    public int binarysearch(int[] sortedArray, int key, int low, int high) {
            int index = -1;

            while (low <= high) {
                int mid = low  + ((high - low) / 2);
                if (sortedArray[mid] < key) {
                    low = mid + 1;
                } else if (sortedArray[mid] > key) {
                    high = mid - 1;
                } else if (sortedArray[mid] == key) {
                    index = mid;
                    break;
                }
            }
        return index;
    }
}