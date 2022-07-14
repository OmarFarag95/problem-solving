class Solution {
    public int[] minOperations(String boxes) {
        ArrayList<Integer> ones = new ArrayList<Integer>();
        int[] answer = new int [boxes.length()];
        
        for(int i=0;i<boxes.length();i++)
        {
            if(boxes.charAt(i)=='1')
                ones.add(i);
        }
        
        
        for(int i=0;i<answer.length;i++)
        {
            for(int j=0;j<ones.size();j++)
            {
                answer[i] += Math.abs(ones.get(j)-i);
            }
        }
        
        return answer;
    }
}
