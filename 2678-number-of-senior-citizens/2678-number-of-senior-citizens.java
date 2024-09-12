class Solution {
    public int countSeniors(String[] details) {
        
        int count = 0;
        
        for(String P : details)
        {
            int curr_age = (P.charAt(11) - '0')*10 + (P.charAt(12) - '0');
            
            if(curr_age > 60)
                count+=1;
        }
        
        return count;
    }
}