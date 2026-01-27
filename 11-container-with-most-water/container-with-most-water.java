class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxWater=0;
        
        while(i<j)
        {
            int width=j-i;
             int ht=Math.min(height[i],height[j]);
            int currWater=width*ht;
            maxWater=Math.max(maxWater,currWater);
            if(height[i]<height[j])
              i++;
             else
              j--;
        }
        
        return maxWater;
    }
}