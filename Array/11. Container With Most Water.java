class Solution {
    public static  int maxArea(int[] height) {
        // using two pointer approach
       int mostWater=Integer.MIN_VALUE;
       int i=0;
        int j=height.length-1;
        while(i<=j){
            int curr=(j-i)*Math.min(height[i],height[j]);
            if(curr>mostWater){
                mostWater=curr;
            }
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return mostWater;
    
}
}
