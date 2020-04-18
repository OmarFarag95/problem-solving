package easy;

import java.util.List;

public class birthday_chocolate {
	static int birthday(List<Integer> s, int d, int m) {
		int count2 = 0;
        int m_count=0;
		int sum = 0;
		int i=0;
        int j=i;
    
     while(j<s.size()){
            while(m_count<m && i<s.size()){
                sum+=s.get(i);
                m_count++;
                i=i+1;
            }
            if(sum==d){
                count2++;
            }
            m_count = 0;
            sum = 0;
            i = j + 1;
            j++;
     }

return Math.abs(count2);
	}
}
