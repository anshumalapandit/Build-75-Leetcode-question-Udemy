import java.util.*;
public class Solution {
    public  int[] twoSum(int nums[], int target) {
HashMap<Integer,Integer> hm=new HashMap<>();
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++){
            int complement = target-nums[i];
            if(!hm.containsKey(complement)){
                hm.put(nums[i],i);
            }else{
                // if complement present on left side
                // take index of it
                arr[0]=hm.get(complement);
                arr[1]=i;
                break;
            }
        }
        return arr;
    }
}
