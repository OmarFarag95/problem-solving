class Solution {

   /*
   Strings are close only if 
   1) both words have same set of characters 
   2) the frequency of any character in first word must be the frequency of any other character in the second word
   */
   public boolean closeStrings(String word1, String word2) {
		if(word1.length() != word2.length()) 
			return false;
		
		//create frequency map for corresponding words
		int[] freqMap1 = new int[26]; 
		int[] freqMap2 = new int[26];
		
		//fill the maps with values
		word1.chars().forEach(i->freqMap1[i - 97]++);
		word2.chars().forEach(i->freqMap2[i - 97]++);
		
		//check if there exists a character that exisit in one word and does not exist in the other word
		for(int i = 0 ; i < 26 ; i++)
			if(freqMap1[i] != 0 || freqMap2[i] != 0)
				if(freqMap1[i] == 0 || freqMap2[i] == 0)
					return false;
		
		//sort both maps to compare values
		Arrays.sort(freqMap1);
		Arrays.sort(freqMap2);
	
		//check if any value is different
		for(int i = 0 ; i < 26 ; i++)
			if(freqMap1[i] != freqMap2[i]) 
				return false;

		return true;
	}

}