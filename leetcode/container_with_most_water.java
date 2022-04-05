/*class Solution {
    public int maxArea(int[] height) {
        
        int max_area = 0;
        
        for(int i=0;i<height.length;i++)
        {
            for(int j=i+1; j<height.length;j++)
            {
                int h = Math.min(height[i],height[j]);

                int w = j-i;
                
                int curr_area = h*w;
                if(curr_area>max_area)
                    max_area=curr_area;
            }
        }
        
        return max_area;
    }
}

*/

class Solution {

    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max_area = 0;

        while (i < j) {

            int w = j - i;
            int h = Math.min(height[i], height[j]);

            int curr_area = h * w;

            if (curr_area > max_area)
                max_area = curr_area;

            if (height[i] < height[j])
                i++;
            else if (height[i] > height[j])
                j--;
            else {
                i++;
                j--;
            }
        }
        return max_area;
    }
}
