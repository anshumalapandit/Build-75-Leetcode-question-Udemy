class Solution {
    public int maxProduct(int[] nums) {
        int maxsum=Integer.MIN_VALUE;
        int cur=1;
        for(int i=0;i<nums.length;i++){
            cur=1;
            for(int j=i;j<nums.length;j++){
                cur*=nums[j];
                if(cur>maxsum){
                    maxsum=cur;
                }
            }
        }
        return maxsum;
    }
}
