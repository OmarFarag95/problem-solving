package easy;

public class counting_valleys {
	static int countingValleys(int n, String s) {
		/*
		 * int magnitude=0; int sealevel=0; int upFirst=0; int count=0; for(int
		 * i=0;i<n;i++) { if(sealevel==0) { if(s.charAt(i)=='U') sealevel=1; else
		 * sealevel=-1; }
		 * 
		 * if(sealevel==1) {
		 * 
		 * if(s.charAt(i)=='U') upFirst++; else upFirst--;
		 * 
		 * if(upFirst==0) sealevel=0; }
		 * 
		 * if(sealevel==-1) { if(s.charAt(i)=='U') magnitude++; else magnitude--; }
		 * 
		 * if(sealevel==-1 && magnitude==0) { count++; sealevel=0; }
		 * 
		 * 
		 * }
		 */

		int lv = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'U') {
				lv++;
				if (lv == 0)
					count++;
			} else
				lv--;

		}
		return count;
	}

}
