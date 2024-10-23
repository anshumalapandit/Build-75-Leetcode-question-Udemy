import java.util.*;
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String ans="";
        for(int i=0;i<32;i++){
            ans+=(n&1);
           n>>=1; // or u can write n=n>>1;
        }
        int a=Integer.parseUnsignedInt(ans,2);
        return a;
    }
}
