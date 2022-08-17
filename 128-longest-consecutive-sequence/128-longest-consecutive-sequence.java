class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        for(int i : nums)
            numbers.add(i);
        
        int largestSequence = 0;
        for(int i:numbers)
        {
            if(!numbers.contains(i-1))
            {
                int currNumber = i;

                int currLength = 1;

                while(numbers.contains(currNumber+1))
                {
                    currNumber+=1;
                    currLength+=1;
                }

                if(currLength>largestSequence)
                    largestSequence = currLength;
            }
            
        }
        
        return largestSequence;
    }
}