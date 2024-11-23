// T.C=> 0(n) S.C=> 0(N)
class Solution {
    public int maxSubArray(int[] nums) {
    int curr=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            curr=Math.max(nums[i],nums[i]+curr);
            max=Math.max(max,curr);
        }
        return max;
    }
}
// T.C=0(N3) Brute force
class Solution {
    public int maxSubArray(int[] nums) {
    int maxsum=Integer.MIN_VALUE;
    int cursum=0;
    int n=nums.length;
        for(int i=0;i<nums.length;i++){
            int start=i;
            for(int j=i;j<n;j++){
                int end=j;
                cursum=0;
                for(int k=start;k<=end;k++){
                   
                    cursum+=nums[k];
                }
                if(maxsum<cursum){
                    maxsum=cursum;
                }
            }
        }
        return maxsum;
    }
}
