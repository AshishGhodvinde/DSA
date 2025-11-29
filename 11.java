class Solution {
    public int maxArea(int[] height) {
        int l=0, h=height.length-1;
        int maxArea = 0;

        while(l < h){
            maxArea = Math.max(maxArea, (h-l)*Math.min(height[l], height[h]));

            if(height[l] < height[h]){
                l++;
            }else{
                h--;
            }
        }
        return maxArea;
    }    
}