class Solution {
    public String removeDigit(String number, char digit) {
        
        int last_occurence = 0;
        for(int i=0;i<number.length();i++)
        {
            if(number.charAt(i) == digit)
            {
                last_occurence = i;
                if(i<number.length()-1 && digit < number.charAt(i+1)) 
                    break;
            }
            
        }
        
        
        number = number.substring(0,last_occurence) + number.substring(last_occurence+1);
        
        
        return number;
    }
}