import java.util.*;
class Solution {
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        for(int i=0;i<ans.length;i++){
            int count=0;
            String bin=Integer.toBinaryString(i);
            for(int j=0;j<bin.length();j++){
                if(bin.charAt(j)!='1'){
                    continue;
                }
                count++;
                ans[i]=count;
            }
            
        }
        return ans;
    }
}
