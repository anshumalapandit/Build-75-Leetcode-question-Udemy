import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> h=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char ch_arr[]=strs[i].toCharArray();
            Arrays.sort(ch_arr);
            String sortedKey=new String(ch_arr);
            if(!h.containsKey(sortedKey)){
                h.put(sortedKey,new ArrayList<>());
            }
            h.get(sortedKey).add(strs[i]);
        }
        return new ArrayList<>(h.values());
    }
}
