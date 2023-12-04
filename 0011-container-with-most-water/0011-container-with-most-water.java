class Solution {
    public int maxArea(int[] height) {
        int x = 0;
        int y = height.length-1;
       
        int ans = 0;
        while(x < y) {
           ans = Math.max(ans, (y-x)*Math.min(height[y],height[x]));
           if(height[x]<height[y]){
               x++;
           }else{
               y--;
           }
        }
        return ans;
    }
}