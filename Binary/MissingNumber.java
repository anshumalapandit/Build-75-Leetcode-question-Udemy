// approach 1 :
import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> s=new HashSet<>();
        // add all nums to set
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        for(int i=0;i<=nums.length;i++){
            if(!s.contains(i)){
                return i;
            }
        }
        return -1;
        
    }
}
// approach 2 : perform XOR operation 
// XOR operation between same num gives 0 and between diff num gives 1
public class Exercise {
    public int missingNumber(int[] nums) {
        // write your code here
        int missing=nums.length;
        for(int i=0;i<nums.length;i++){
            missing^=nums[i]^i;
        }
        return missing;
    }
}
