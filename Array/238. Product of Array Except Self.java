class Solution {
    // Time limit exceeded 
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            int p=1;
            for(int j=0;j<n;j++){
                if(i!=j){
                p*=nums[j];
            }
            }
            ans[i]=p;
        }
        return ans;
    }
}
// Better Approach T.C=>0(N) S.C=> 0(3N)=0(N) without using division operator
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int pp[]=new int[n];
        pp[0]=1; // in left we have nothing
        int sp[]=new int[n];
        sp[n-1]=1; // in right we have nothing
        // calculating prefix profuct
        for(int i=1;i<n;i++){
            pp[i]=pp[i-1]*nums[i-1];
        }
        
        //calculating suffix product
        for(int i=n-2;i>=0;i--){
            sp[i]=sp[i+1]*nums[i+1];
        }
        // now multiplying corresponding value and storing in ans array
        for(int i=0;i<n;i++){
            int curr=pp[i]*sp[i];
            ans[i]=curr;
        }
        return ans;
    }
    }
