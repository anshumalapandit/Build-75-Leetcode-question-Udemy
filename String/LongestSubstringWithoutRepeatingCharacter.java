import java.util.HashMap;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int ans=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            char cur=s.charAt(right);
            if(!map.containsKey(cur)){
                // if curr character do not exist then insert 
                map.put(cur,right);
            }else{
                // if exist means its duplicate so update left pointer then insert
                left=Math.max(left,map.get(cur)+1);
                map.put(cur,right);
            }
            // here i am calculating length
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}
