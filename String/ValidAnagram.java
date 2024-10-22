// what is anagram => same character in same amount should be present  in both string irespective of sequence
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int ans[]=new int[26]; 
        for(int i=0;i<s.length();i++){
            char cur=s.charAt(i);
            char c2=t.charAt(i);
            ans[cur-'a']++;
            ans[c2-'a']--;
        }
        for(int i=0;i<ans.length;i++){
            if(ans[i]!=0){
                return false;
            }
        }
        return true;
    }
}
